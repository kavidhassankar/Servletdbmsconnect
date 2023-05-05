# Servletdbmsconnect
![Screenshot (31)](https://user-images.githubusercontent.com/122589638/236380222-2e476bca-4072-4881-8c4b-5fb94c7e605e.png)
1.1) • Create servlet page in "tb_customer" table. Columns: id, name, code, email, phone, contact_person_name, contact_person_phone, status, created_date, created_by, modified_date, modified_by.
![Screenshot (25)](https://user-images.githubusercontent.com/122589638/236380282-7bece6bf-2a27-4be3-9723-33da04dded90.png)
1.2) • Create servlet page "tb_customer_address" table. Columns: id, customer_id, address_type, address_line1, address_line2, city, state,country,postal_code. Add unique constraints for customer_id and address_type column.
![Screenshot (27)](https://user-images.githubusercontent.com/122589638/236380401-af65b10a-c718-4597-ab8e-2deed0ff3de9.png)
1.3) • Create servlet page "customer_order" table. Columns: id, customer_id, order_no, order_date, no_of_items, order_sub_total, order_discount, order_total_amount, payment_type, delivery_date, status, created_date, created_by, modified_date, modified_by.
![Screenshot (29)](https://user-images.githubusercontent.com/122589638/236380466-b61e6b09-8af2-4568-8f57-7693a0b35a5d.png)
1.4) • Create servlet page "customer_order_item" table. Columns: id, order_id, item_name, item_sku, item_rate, ordered_qty, order_total.
![Screenshot (30)](https://user-images.githubusercontent.com/122589638/236380593-ae2c1100-6043-40b8-928e-305e50c59482.png)
2.•To Create servlet page ,insert 10 customer records. Each customer should have a minimum of 2-3 address records with different address types. Each customer record id should be mapped as foreign key in the customer address table. All insert scripts should be mentioned in a single SQL file and table data snippet should be taken for the proof.
![Screenshot 2023-05-04 165053](https://user-images.githubusercontent.com/122589638/236381054-ce1380ef-4b00-48e0-8db4-476e1b046926.png)
3.• Write select query to pull data from customer table. Record the script and take a snippet of output.
![image](https://user-images.githubusercontent.com/122589638/236382705-f5e75e67-6f53-4613-8066-e8a10519cef2.png)

4.• Update top 5 customer status as Deleted from Active & also update modified time as well.
![5](https://user-images.githubusercontent.com/122589638/236382943-5fc12358-c6d1-40e1-9c2f-d9f96aae75ec.png)

5.Write select query to pull only an active status customer.
![7](https://user-images.githubusercontent.com/122589638/236383146-fb493eb2-762b-4cc4-9bbf-21c725acb0e5.png)
6.• Write query to pull all active customers with only the home address type address record.
![Screenshot 2023-05-04 142856](https://user-images.githubusercontent.com/122589638/236383190-6e76add8-dc39-47e3-b938-88728f8830cc.png)

7. let's consider customer is creating orders. Each order must have one or more items. Basically write insert statements with proper order items. Create orders only for half of the customers.
![Screenshot 2023-05-04 143521](https://user-images.githubusercontent.com/122589638/236383697-42aabf7d-7db6-4835-9766-f579f28ad9de.png)




