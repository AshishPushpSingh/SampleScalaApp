package controllers

import play.api.mvc._

/**
  * Created by Ashish Pushp Singh on 12/8/17 @play-scala-starter-example. 
  */
class SampleController extends Controller  {

  def index: Action[AnyContent] = Action {
    val json: String = "  \"id\": \"file\",\n  \"value\": \"File\",\n  \"popup\": {\n    \"menuitem\": [\n      " +
      "{\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n    ]\n  }\n}}"

    Ok(json).as("application/json")
  }

}
