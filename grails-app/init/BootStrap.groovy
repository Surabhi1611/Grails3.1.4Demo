import com.ttnd.demo.User

class BootStrap {

    def init = { servletContext ->

        if(!User.count()){
            println("Creating User")
            20.times {
                new User(firstName: "Surabhi" + it,lastName: "Goyal" + it,email: "Surabhi" + "Goyal" + it.toString() + "@gmail.com",userName: "surabhi.goyal"+it,password: "surabhi"+it).save()
            }
        }
    }
    def destroy = {
    }
}
