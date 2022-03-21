package br.com.dornelasit.mongotest.document;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.NoRepositoryBean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@NoRepositoryBean
public class AbstractDocument implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;

	/**
	 * ObjectId needs to be converted to string
	 * @return
	 */
	public String getId() { return id.toHexString(); }
	
	/**
	 * ObjectId needs to be converted to Date
	 * @return
	 */
	public Date getDate() { return id.getDate(); }

	/**
	 *
	 * @return
	 */
	public ObjectId getObjectId() { return id; }

	 /**
	  * @param id
	  */
	public void setId(ObjectId id) { this.id = id; }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (id == null ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		final AbstractDocument other = (AbstractDocument) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.equals(other.id)){
			return false;
		}
		return true;
	}

}