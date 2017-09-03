package com.example.htl.W1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="fixed_menu_items")
public class FixedMenuItems {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="fixed_menu_item_id", columnDefinition="int(11)")
	private long fixedMenuItemsId;
	
	@Column(name="fixed_menu_description")
	private String fixedMenuDescription;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ref_menu_id", nullable=false, columnDefinition="int(11)")
	private Menu menuItemReference;

	public long getFixedMenuItemsId() {
		return fixedMenuItemsId;
	}

	public void setFixedMenuItemsId(long fixedMenuItemsId) {
		this.fixedMenuItemsId = fixedMenuItemsId;
	}

	public String getFixedMenuDescription() {
		return fixedMenuDescription;
	}

	public void setFixedMenuDescription(String fixedMenuDescription) {
		this.fixedMenuDescription = fixedMenuDescription;
	}

	public Menu getMenuItemReference() {
		return menuItemReference;
	}

	public void setMenuItemReference(Menu menuItemReference) {
		this.menuItemReference = menuItemReference;
	}


	
}