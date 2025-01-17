package meli.dh.com.finalmeliproject.repository;

import meli.dh.com.finalmeliproject.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Long> {
}
