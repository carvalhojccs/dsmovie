package br.com.paraclean.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId
	private ScorePk id = new ScorePk();
	
	private Double value;

	public Score() {
	
	}

	public Score(ScorePk id, Double value) {
		this.id = id;
		this.value = value;
	}

	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUset(User user) {
		id.setUser(user);
	}
	
	public ScorePk getId() {
		return id;
	}

	public Double getValue() {
		return value;
	}
	
	
	
	
}
