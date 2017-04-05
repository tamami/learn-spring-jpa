package lab.aikibo;

import lab.aikibo.entity.RefKecamatan;
import lab.aikibo.repo.RefKecamatanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

import static java.lang.System.exit;

@SpringBootApplication
@ComponentScan("lab.aikibo")
public class LearnSpringJpaApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	RefKecamatanRepo refKecamatanRepo;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringJpaApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		System.out.println("DataSource = " + dataSource);
		for(RefKecamatan data : refKecamatanRepo.findAll()) {
			System.out.println(data.getKdKecamatan() + " : " + data.getNmKecamatan());
		}

        exit(0);
	}
}
