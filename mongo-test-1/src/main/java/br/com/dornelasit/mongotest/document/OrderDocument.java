package br.com.dornelasit.mongotest.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@Document(collection="orders")
public class OrderDocument  extends AbstractDocument {
	
	private static final long serialVersionUID = -1097413791594409237L;

	@Id
	private String id;
	
	private Long orderId;
	
	private String customerName;
	
	private String addDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	@Override
	public String toString() {
		return "OrderDocument [id=" + id + ", orderId=" + orderId + ", customerName=" + customerName + ", addDate="
				+ addDate + "]";
	}

}
