(ns todoist-clone.views
  (:require
   [re-frame.core :as re-frame]
   [todoist-clone.subs :as subs]
   ["react-icons/fa" :refer [FaBeer]]
   ))

(defn menu-button [icon click-handler]
  [:div {:class "w-28px
                 h-28px"
         :on-click click-handler}
   [:> icon {:color "white"}]])

(defn menu-bar []
  [:div {:class "sticky flex
                 bg-todoist-primary"}
   [menu-button FaBeer]])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [menu-bar]]))
