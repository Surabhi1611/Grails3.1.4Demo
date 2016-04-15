import com.ttnd.demo.User

class BootStrap {

    def init = { servletContext ->

        if(!User.count()){
            println("Creating User")
            20.times {
                new User(firstName: "Surabhi" + (it+1),lastName: "Goyal" + (it+1),email: "Surabhi" + "Goyal" + (it+1).toString() + "@gmail.com",userName: "surabhi.goyal"+(it+1),password: "surabhi"+(it+1)).save()
            }
        }
    }
    def destroy = {
    }
}
