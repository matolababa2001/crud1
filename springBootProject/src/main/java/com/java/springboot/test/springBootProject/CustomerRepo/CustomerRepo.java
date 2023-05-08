package main.java.com.java.springboot.test.springBootProject.CustomerRepo;

@EnableJpaRepositories
@Repository
public abstract sealed class CustomerRepo permits CustomerRepoImpl {
}
