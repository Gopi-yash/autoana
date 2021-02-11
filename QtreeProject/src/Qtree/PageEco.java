package Qtree;

import org.openqa.selenium.By;

public class PageEco {
	
	public By sign=By.xpath("//*[@class='login']");
	public By username=By.xpath("//*[@id='email']");
	public By pass=By.xpath("//*[@id='passwd']");
	public By search=By.xpath("//*[@id='search_query_top']");
	public By searchclick=By.xpath("//*[@class='btn btn-default button-search']");
	public By product=By.xpath("//*[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//*[contains(text(),'Add to cart')]");
	public By productlink=By.xpath("//*[@src='http://automationpractice.com/img/p/2/0/20-small_default.jpg']");
	public By Tshirt=By.xpath("(//*[@href='http://automationpractice.com/index.php?id_category=5&controller=category'])[2]");
	public By women=By.xpath("(//*[@href='http://automationpractice.com/index.php?id_category=3&controller=category'])[1]");
	public By eveningdress=By.xpath("(//*[@href=\"http://automationpractice.com/index.php?id_category=10&controller=category\"])[1]");
	public By addcart=By.xpath("(//*[@class='replace-2x img-responsive'])[2]");
	public By quantity=By.xpath("//*[@class='btn btn-default button-plus product_quantity_up']");
	public By size=By.xpath("//*[@id='group_1']");
	public By productsubmit=By.xpath("//*[@class='exclusive']");
	public By proceedcheck=By.xpath("//*[@title='Proceed to checkout']");
	public By cartbutton=By.xpath("//*[@title='View my shopping cart']");
	public By cartsubmitbutton=By.xpath("//*[@id='button_order_cart']");
	public By proceedcheck1=By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']");
	public By cartdelete=By.xpath("//*[@class='cart_quantity_delete']");
	public By continueshopping=By.xpath("//*[@class='button-exclusive btn btn-default']");
}
