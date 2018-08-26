package learner

object ExtractorsSample {
  def main(args: Array[String]): Unit = {
    println(FreeUser.unapply(new FreeUser("Phani")))
    println(PremiumUser.unapply(new PremiumUser("Phani")))

    var user: User = new FreeUser("Phani")
    println(user match {
      case FreeUser(name)    => s"Hello ${user.name}"
      case PremiumUser(name) => s"Welcome back ${user.name}"
    })
  }

  trait User {
    def name: String
  }

  class FreeUser(val name: String) extends User
  class PremiumUser(val name: String) extends User

  object FreeUser {
    def unapply(user: FreeUser) = Some(user.name)
  }

  object PremiumUser {
    def unapply(user: PremiumUser) = Some(user.name)
  }
}