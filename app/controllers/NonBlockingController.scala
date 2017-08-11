package controllers

import javax.inject._

import play.api.libs.ws.{WSClient, WSRequest, WSResponse}
import play.api.mvc._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
  * Created by Ashish Pushp Singh on 12/8/17 @play-scala-starter-example.
  */


class NonBlockingController @Inject()(ws: WSClient, val controllerComponents: ControllerComponents) extends
  BaseController {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def getData: Action[AnyContent] = Action.async {
    // Call some blocking API
    val request: WSRequest = ws.url("https://reqres.in/api/unknown")
    val response: Future[WSResponse] = request.get()
    response.map(s => {
      if (s.status == 200) Ok(s.body).as("application/json")
      else Ok("Oops!! Something Went wrong").as("application/json")
    })
  }
}
