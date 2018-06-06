(ns chatbot.core
  (:gen-class)
  (:require [gniazdo.core :as ws]))
   ;; [pneumatic-tubes.core :as tubes]

(def url "ws://localhost:3449/chat?name=chatbot&room=test")

(defn handle-message [data] 
  (prn 'received data))
    
(defn send-message [message] 
      (ws/send-msg socket (str "[\"~:post-message\",\"" message "\"]")))

(def message-generator
  (send-message "Do I work now?"))

(def socket
  (ws/connect
   url
   :on-receive #(handle-message %))) ;;prn 'received %

(def close-socket 
  (ws/close socket))
            
            
                                    
 
  
  
  
