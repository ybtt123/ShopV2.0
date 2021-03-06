package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Commodity entity. @author MyEclipse Persistence Tools
 */

public class Commodity implements java.io.Serializable {

	// Fields

	private CommodityId id;
	private String commName;
	private String commPrice;
	private String commNumber;
	private String commDescription;
	private String commPicUrl;
	private String type;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Commodity() {
	}

	/** minimal constructor */
	public Commodity(CommodityId id, String commName, String commPrice, String commNumber, String commDescription,
			String type) {
		this.id = id;
		this.commName = commName;
		this.commPrice = commPrice;
		this.commNumber = commNumber;
		this.commDescription = commDescription;
		this.type = type;
	}

	/** full constructor */
	public Commodity(CommodityId id, String commName, String commPrice, String commNumber, String commDescription,
			String commPicUrl, String type, Set orders) {
		this.id = id;
		this.commName = commName;
		this.commPrice = commPrice;
		this.commNumber = commNumber;
		this.commDescription = commDescription;
		this.commPicUrl = commPicUrl;
		this.type = type;
		this.orders = orders;
	}

	// Property accessors

	public CommodityId getId() {
		return this.id;
	}

	public void setId(CommodityId id) {
		this.id = id;
	}

	public String getCommName() {
		return this.commName;
	}

	public void setCommName(String commName) {
		this.commName = commName;
	}

	public String getCommPrice() {
		return this.commPrice;
	}

	public void setCommPrice(String commPrice) {
		this.commPrice = commPrice;
	}

	public String getCommNumber() {
		return this.commNumber;
	}

	public void setCommNumber(String commNumber) {
		this.commNumber = commNumber;
	}

	public String getCommDescription() {
		return this.commDescription;
	}

	public void setCommDescription(String commDescription) {
		this.commDescription = commDescription;
	}

	public String getCommPicUrl() {
		return this.commPicUrl;
	}

	public void setCommPicUrl(String commPicUrl) {
		this.commPicUrl = commPicUrl;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}