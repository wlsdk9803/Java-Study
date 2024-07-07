package hello.hello_spring.domain;

import jakarta.persistence.*;

// jpa는 ORM (Object와 Relational DB를 Mapping 한다는 뜻)
@Entity // jpa가 관리하는 entity라는 뜻
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // id가 자동 생성된다는 뜻
    private Long id;

//    @Column(name = "username")
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
