package pe.edu.tecsup.crm.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.Properties;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public JavaMailSenderImpl mailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        javaMailSender.setHost("127.0.0.1");
        //javaMailSender.setUsername("tecsupvirtual@tecsup.edu.pe");
        //javaMailSender.setPassword("TECSUPVIRTUAL2015");
        javaMailSender.setPort(25);
        Properties properties = new Properties();
        properties.put("mail.smtp.ssl.enable", false);
        javaMailSender.setJavaMailProperties(properties);

        return javaMailSender;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/**").permitAll()
                .antMatchers("/home/**").authenticated()
                .and()
                    .formLogin().loginPage("/login").loginProcessingUrl("/authenticate").defaultSuccessUrl("/home/").failureUrl("/login?error").usernameParameter("username").passwordParameter("password")
                .and()
                    .logout().logoutUrl("/logout").logoutSuccessUrl("/")
                .and()
                    .csrf().disable();

    }

}