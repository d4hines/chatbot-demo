(ns chatbot.core
  (:gen-class)
  (:require [clojure.string :as str]
            [cognitect.transit :as t]
            [gniazdo.core :as ws])
  (:import (java.io ByteArrayInputStream ByteArrayOutputStream)))

   ;; [pneumatic-tubes.core :as tubes]

(def url "ws://localhost:3449/chat?name=chatbot&room=test")

<<<<<<< HEAD
(defn handle-message [data] 
  (prn 'received data))
    
(defn send-message [message] 
  (ws/send-msg socket (str "[\"~:post-message\",\"" message "\"]")))
        
(def socket
  (ws/connect
    url
    :on-receive #(handle-message %))) ;;prn 'received %

(def message-generator
  (send-message "Hi, Internet! I am ChAI!"))

(def close-socket 
  (ws/close socket))
            
            
                                    
 
  
  
  
=======
(def ^:dynamic *string-encoding* "UTF-8")

(defn read-str
  "Reads a value from a decoded string"
  ([s type] (read-str s type {}))
  ([^String s type opts]
   (let [in (ByteArrayInputStream. (.getBytes s *string-encoding*))]
     (t/read (t/reader in type opts)))))

(defn handle-message [data]
  (prn (read-str data :json)))

(def socket
  (ws/connect
      url
    :on-receive #(handle-message %)))

(defn send-message [message]
      (ws/send-msg socket (str "[\"~:post-message\",\"" message "\"]")))

(send-message "Do I work now?")

;;prn 'received %

;; (ws/close socket)

>>>>>>> c4396b9c5f5236513fc3a140673f5fce25add6ec
