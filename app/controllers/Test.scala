package controllers

import play.api.mvc._

object Test extends Controller {

  def present = Action {
    Ok(views.html.test("Test"))
  }

}