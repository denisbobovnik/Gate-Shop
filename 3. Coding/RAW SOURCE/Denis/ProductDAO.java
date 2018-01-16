public class ProductDAO {

	public void saveProduct(Product product) {
		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement("insert into products(products_id, name, description, preview) values (?,?,?,?)");
			ps.setInt(1, product.getProductID());
			ps.setString(2, product.getName());
			ps.setString(3, product.getDescription());
			ps.setString(4, product.getPreview());
			ps.executeUpdate();

		} finally {
			if(conn!=null)
			conn.close();
		}
	}

	public Product selectProduct(int productID) {
		Product ret = null;
		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement("select * from products where products_id=?");
			ps.setInt(1, productID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ret=new Product(rs.getInt("products_id"),rs.getString("name"),rs.getString("description"),rs.getString("preview"));
				break;
			}
			rs.close();

		} finally {
			if(conn!=null)
			conn.close();
		}
		return ret;
	}
}