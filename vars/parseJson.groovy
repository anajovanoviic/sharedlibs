import groovy.json.JsonSlurper


def call() {
    echo "Hey, How are you?"
  
  String jsonURL = "http://localhost:8080/job/putanja/2/api/json?pretty=true"
  
  URL url = new URL(jsonURL)

  def card = new JsonSlurper().parseText(url.text)

  println(card.actions.causes.userName);
  println(card.actions.causes.shortDescription);
  println(card.fullDisplayName);
  
        
}
