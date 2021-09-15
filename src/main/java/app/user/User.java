package app.user;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;


    @Getter
    @Setter
    @Entity

    @AllArgsConstructor
    @NoArgsConstructor
    public class User implements UserDetails {


        @Id
        @GeneratedValue
        private long id;

        public User(String password, String username,  UserRole userRole) {
            this.password = password;
            this.username = username;
            this.userRole = userRole;
        }

        @Column
        private String password;

        @Column
        private String username;

        private boolean locked;

        private boolean enabled;

        @Enumerated (EnumType.STRING)
        private UserRole userRole;

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities()
        { SimpleGrantedAuthority authority =
                new SimpleGrantedAuthority(userRole.name());
            return Collections.singletonList(authority);
        }


        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return !locked;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return enabled;
        }
    }
