package com.ebrainsql.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ebrainsql.Dto.CusHomeActive;
import com.ebrainsql.Dto.Customer;
import com.ebrainsql.Dto.CustomerAddress;
import com.ebrainsql.Dto.OrderHalf;
import com.ebrainsql.Dto.OrderItems;
import com.ebrainsql.Dto.customerOrder;
import com.ebrainsql.controller.OrderItemHalf;

public class CustomerDb {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.155.156:3306/dbms_april_2023",
				"dbms_april_2023", "Ebrain@20");
		return connection;
	}

	public void saveCustomer(Customer obj) throws ClassNotFoundException, SQLException {

		Connection connection = getConnection();

		String inserquery = "INSERT INTO tb_kavidhass_customer(id,cus_name,cus_code, email,phone,contact_person_name,contact_person_phone,cus_status,created_date,created_by,modified_date,modified_by) value(?,?,?,?,?,?,?,?,? ,?,?,?)";

		PreparedStatement pst = connection.prepareStatement(inserquery);

		pst.setString(1, obj.getId());
		pst.setString(2, obj.getName());
		pst.setString(3, obj.getCode());
		pst.setString(4, obj.getEmail());
		pst.setString(5, obj.getPhone());
		pst.setString(6, obj.getContactpersonname());
		pst.setString(7, obj.getContactpersonphone());
		pst.setString(8, obj.getCusstatus());
		pst.setString(9, obj.getDate());
		pst.setString(10, obj.getCreatedby());
		pst.setString(11, obj.getDate2());
		pst.setString(12, obj.getModifiedby());

		pst.executeUpdate();

	}

	public void saveAddress(CustomerAddress ob) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();

		String inserque = "INSERT INTO tb_kavidhass_customer_address (id,customer_id,address_type,address_line1,address_line2,city,state,country,postal_code) VALUE (?,?,?,?,?,?,?,?,?)";
		PreparedStatement ii = connection.prepareStatement(inserque);
		ii.setString(1, ob.getID());
		ii.setString(2, ob.getCustomerid());
		ii.setString(3, ob.getAddress_type());
		ii.setString(4, ob.getAddressline1());
		ii.setString(5, ob.getAddressline2());
		ii.setString(6, ob.getCity());
		ii.setString(7, ob.getState());
		ii.setString(8, ob.getCountry());
		ii.setString(9, ob.getPostal_code());

		ii.executeUpdate();
	}

	public void saveOrder(customerOrder ydy) throws ClassNotFoundException, SQLException {

		Connection connection = getConnection();

		String insert = "INSERT INTO tb_kavi_customer_orde (customer_id,order_no,order_date,no_of_items,order_sub_total,order_discount,payment_type,delivery_date,cus_status,created_date,created_by,modified_date,modified_by) VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement ii = connection.prepareStatement(insert);

		ii.setString(1, ydy.getCustomerid());
		ii.setString(2, ydy.getOrder_no());
		ii.setString(3, ydy.getOrder_date());
		ii.setString(4, ydy.getNo_ofitems());
		ii.setString(5, ydy.getOrder_sub_total());
		ii.setString(6, ydy.getOrder_discount());
		ii.setString(7, ydy.getPayment_type());
		ii.setString(8, ydy.getDelivery_date());
		ii.setString(9, ydy.getCus_status());
		ii.setString(10, ydy.getCreated_date());
		ii.setString(11, ydy.getCreated_by());
		ii.setString(12, ydy.getModified_date());
		ii.setString(13, ydy.getModified_by());

		ii.executeUpdate();
	}

	public void saveOderItem(OrderItems ug) throws SQLException, ClassNotFoundException {

		Connection connection = getConnection();

		String insert = "INSERT INTO tb_kavi_customer_order_item(order_id,item_name,item_sku,item_rate,ordered_qty,order_total ) VALUE (?,?,?,?,?,?)";

		PreparedStatement ii = connection.prepareStatement(insert);
		ii.setString(1, ug.getOrderid());
		ii.setString(2, ug.getItemname());
		ii.setString(3, ug.getItem_sku());
		ii.setString(4, ug.getItemrate());
		ii.setString(5, ug.getOrderedqty());
		ii.setString(6, ug.getOrder_total());

		ii.executeUpdate();
	}

	public static List<Customer> getAlluser() throws SQLException, ClassNotFoundException {

		Connection connection = getConnection();

		String select = "SELECT * from tb_kavidhass_customer";

		PreparedStatement ii = connection.prepareStatement(select);

		ResultSet resultSet = ii.executeQuery();

		List<Customer> user = new ArrayList<Customer>();

		while (resultSet.next()) {

			Customer obj = new Customer();

			obj.setId(resultSet.getString("id"));
			obj.setName(resultSet.getString("cus_name"));
			obj.setCode(resultSet.getString("cus_code"));
			obj.setEmail(resultSet.getString("email"));
			obj.setPhone(resultSet.getString("phone"));
			obj.setContactpersonname(resultSet.getString("contact_person_name"));
			obj.setContactpersonphone(resultSet.getString("contact_person_phone"));
			obj.setCusstatus(resultSet.getString("cus_status"));
			obj.setDate(resultSet.getString("created_date"));
			obj.setCreatedby(resultSet.getString("created_by"));
			obj.setDate2(resultSet.getString("modified_date"));
			obj.setModifiedby(resultSet.getString("modified_by"));

			user.add(obj);
		}

		return user;
	}

	public static List<Customer> getStatus() throws ClassNotFoundException, SQLException {

		Connection connection = getConnection();

		String select = "SELECT * FROM tb_kavidhass_customer WHERE cus_status='Active'";

		PreparedStatement ii = connection.prepareStatement(select);

		ResultSet resultSet = ii.executeQuery();

		List<Customer> user = new ArrayList<Customer>();

		while (resultSet.next()) {

			Customer obj = new Customer();

			obj.setId(resultSet.getString("id"));
			obj.setName(resultSet.getString("cus_name"));
			obj.setCode(resultSet.getString("cus_code"));
			obj.setEmail(resultSet.getString("email"));
			obj.setPhone(resultSet.getString("phone"));
			obj.setContactpersonname(resultSet.getString("contact_person_name"));
			obj.setContactpersonphone(resultSet.getString("contact_person_phone"));
			obj.setCusstatus(resultSet.getString("cus_status"));
			obj.setDate(resultSet.getString("created_date"));
			obj.setCreatedby(resultSet.getString("created_by"));

			user.add(obj);
		}
		return user;

	}

	public static List<CusHomeActive> getHomeAddress() throws ClassNotFoundException, SQLException {

		Connection connection = getConnection();

		String sql = " SELECT c.id,c.cus_name,c.email,c.cus_status,c.contact_person_name,a.address_type,a.address_line1,a.customer_id"
				+ " FROM tb_kavidhass_customer c INNER JOIN tb_kavidhass_customer_address a ON  a.customer_id = c.id WHERE c.`cus_status` = 'Active' AND a.address_type= 'Home'";

		PreparedStatement ii = connection.prepareStatement(sql);

		ResultSet resultSet = ii.executeQuery();

		List<CusHomeActive> user = new ArrayList<CusHomeActive>();

		while (resultSet.next()) {

			CusHomeActive obj = new CusHomeActive();

			obj.setId(resultSet.getInt("id"));
			obj.setName(resultSet.getString("cus_name"));
			obj.setCode(resultSet.getString("email"));
			obj.setContactPersonName(resultSet.getString("contact_person_name"));
			obj.setStatus(resultSet.getString("cus_status"));
			obj.setCustomerId(resultSet.getInt("customer_id"));
			obj.setAddressType(resultSet.getString("address_type"));
			obj.setAddressLine1(resultSet.getString("address_line1"));

			user.add(obj);

		}
		return user;
	}

	public static List<OrderHalf> getItemOrder() throws ClassNotFoundException, SQLException {

		Connection connection = getConnection();

	
		String sql ="SELECT b.id,d.order_id,d.item_name,b.no_of_items,d.item_sku,d.item_rate,b.order_no,b.payment_type,b.order_date,b.delivery_date "
				+ "FROM tb_kavi_customer_orde b JOIN tb_kavi_customer_order_item d  ON d.order_id= b.id WHERE b.id LIMIT 5";


		PreparedStatement ii = connection.prepareStatement(sql);

		ResultSet resultSet = ii.executeQuery();

		List<OrderHalf> user = new ArrayList<OrderHalf>();

		while (resultSet.next()) {

			OrderHalf obj = new OrderHalf();
			obj.setId(resultSet.getInt("id"));
			obj.setOrderid(resultSet.getInt("order_id"));
			obj.setItemname(resultSet.getString("item_name"));
			obj.setNoofitems(resultSet.getString("no_of_items"));
			obj.setItem_sku(resultSet.getString("item_sku"));
			obj.setItemrate(resultSet.getString("item_rate"));
			obj.setOrder_no(resultSet.getString("order_no"));
			obj.setPayment_type(resultSet.getString("payment_type"));
			obj.setOrder_date(resultSet.getString("order_date"));
			obj.setDeliverydate(resultSet.getString("delivery_date"));
					
			
		
			user.add(obj);

		}
		return user;
	}
}
