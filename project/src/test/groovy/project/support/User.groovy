package project.support

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class User {
    @Id
    Long id;

    public User() {

    }

    public User(id) {
        this.id = id
    }
}

