package bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class Index {

    @PostConstruct
    public void init() {
        System.out.println("Test!");
    }

    public String getMessage() {
        return "Test!";
    }
}

