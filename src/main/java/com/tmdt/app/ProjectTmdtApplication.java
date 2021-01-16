package com.tmdt.app;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Sets;
import com.tmdt.app.model.Domain;
import com.tmdt.app.model.Package;
import com.tmdt.app.model.Post;
import com.tmdt.app.repository.UserRepository;
import com.tmdt.app.service.ManageAccountService;
import com.tmdt.app.service.PostingService;

@SpringBootApplication
public class ProjectTmdtApplication implements CommandLineRunner {
	@Autowired
	private UserRepository repository;
	@Autowired
	private EntityManager em;
	@Autowired
	private ManageAccountService service;

	public static void main(String[] args) {
		SpringApplication.run(ProjectTmdtApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		Post post = new Post();
//		post.setAddress("Ho Chi Minh City");
//		post.setDescription(
//				"Lorem ipsum dolor sit amet consectetur adipisicing elit. Fugit quam qui exercitationem fuga ut, officia molestiae sit earum odit, quis consequuntur quae blanditiis! Saepe molestiae veniam fuga in dignissimos aliquam?\n"
//						+ "                        Natus quisquam velit vel explicabo nam dignissimos laborum veniam consequuntur ipsa mollitia, numquam, aut sequi laboriosam aperiam voluptate architecto accusamus neque officiis? Quibusdam voluptates temporibus aut sapiente deserunt dolore omnis?\n"
//						+ "                        Officiis, libero expedita vitae ea exercitationem nesciunt reiciendis doloribus ullam adipisci fugit hic ipsum, quod provident a cupiditate doloremque aspernatur molestias maiores. Blanditiis odio at, eaque eveniet ullam velit suscipit.\n"
//						+ "                        Ipsum reiciendis, harum odit cum animi maxime tenetur repellendus alias sequi velit eius vitae dignissimos, voluptate doloribus nisi voluptatum sed cupiditate ipsam vel. Eveniet eaque reiciendis esse molestias quo! Debitis?\n");
//		Domain domain = new Domain();
//		domain.setId(1L);
//		post.setDomain(domain);
//		post.setExperiences(Sets.newHashSet("kienthucngonngu1", "kienthucngonngu2", "kienthucngonngu3",
//				"kienthucngonngu4", "kienthucngonngu5"));
//		post.setKnowledges(Sets.newHashSet("kienthucngonngu1", "kienthucngonngu2", "kienthucngonngu3",
//				"kienthucngonngu4", "kienthucngonngu5"));
//		com.tmdt.app.model.Package pk = new Package();
//		pk.setId(1L);
//		post.setPackageType(pk);
//		post.setPost_date(new Date(System.currentTimeMillis()));
//		post.setPostExp_date(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 5));
//		post.setSalary(BigDecimal.valueOf(1000.00));
//		post.setSlot(10);
//		post.setTitle("IT JOB IN HCM CITY");
//		em.persist(post);
//		Post find = em.find(Post.class, 2L);
//		find.setPost_date(new Date(System.currentTimeMillis()));
//		find.setPostExp_date(new Date(System.currentTimeMillis()+1000*60*60*24*10L));
	}
}
