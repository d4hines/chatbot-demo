(ns chatbot.core
  (:gen-class)
  (:require [gniazdo.core :as ws]
   ;; [pneumatic-tubes.core :as tubes]
   ))
(def socket
  (ws/connect
   "ws://localhost:3449/chat?name=chatbot&room=test"
   :on-receive #(prn 'received %)))
(ws/send-msg socket "[\"~:post-message\",\"Hi, I'm Chatbot\"]")

