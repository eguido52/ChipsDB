package edu.csumb.cst438.chipsdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.cst438.chipsdb.entities.chip;

@Component
public class ChipsDbSeeder implements CommandLineRunner{

    @Autowired
    IChipsRepository chipsRepo;
    
    @Override
    public void run(String... args) throws Exception {

        chip kettle = new chip("Honey Dijon Kettle Chips","Dijon mustard is sophisticated and a bit snooty. Honey is smooth, sweet and a little wild. But when they come together, sparks fly.",2.61,10,"https://cdn.shopify.com/s/files/1/0558/1897/products/0003759_kettle-honey-dijon-chip.jpg?v=1450320427");
        chip veggie = new chip("Garden Veggie Straws","Airy, crunchy Straws combining garden-grown potatoes and ripe vegetables to form a better-for-you snack that has 30% less fat than the leading potato chip.",2.99,3,"https://target.scene7.com/is/image/Target/GUEST_f11ee439-aaea-425d-aad9-0d9377e20dbe?wid=488&hei=488&fmt=pjpeg");
        chip sunchip = new chip("Harvest Cheddar Sunchips","So technically you can’t farm cheddar but it sure would be delicious. The flavor of real cheddar cheese is layered onto a delicious, whole grain chip to create this tasty combination.",3.29,5,"https://www.dollargeneral.com/media/catalog/product/cache/image/700x700/e9c3970ab036de70892d86c6d221abfe/0/0/00028400147392_0.jpg");
        chip popchip = new chip("Barbeque Popchips","Who needs backyard smoke and sizzle to enjoy lip-smacking barbeque? With our chips you’ll taste tangy sauce and a hint of smoke on every chip. So pull up to the picnic table and savor the flavor.",3.49,7,"https://d2lnr5mha7bycj.cloudfront.net/product-image/file/large_ef9a47fb-68b5-40ad-b88c-003db2b43e4e.jpg");
        chip doritos = new chip("Cool Ranch Doritos ","Cool Ranch flavored tortilla Chips",2.89,12,"https://images-na.ssl-images-amazon.com/images/I/91elpTzstuL._SY355AA355_PIbundle-64,TopRight,0,0_AA355_SH20_.jpg");
        chip bbq = new chip("Lays Barbecue Chips","Tangy Barbeque flavored potatoe chips",3.19,3,"https://images-na.ssl-images-amazon.com/images/I/51BJX9eAVIL.jpg");
        chip stax = new chip("All American Cheeseburger Stax","Lays All American Cheeseburger flavored Staxs",1.48,8,"https://i5.walmartimages.com/asr/a0ec74b4-552e-4fa7-a051-89fe78939f6c_1.5a4c450f5cd8d9087438e4d380471ee3.jpeg?odnHeight=450&odnWidth=450&odnBg=FFFFFF");
        chip takis = new chip("Takis Fuego","Barcels spicy, mini, roll-shaped, tortilla corn chips ",2.79,5,"https://static.meijer.com/Media/075/75280/0757528008680_a1c1_0600.png");
        chip ruffles = new chip("Cheddar & Sour Cream Ruffles","Cheddar and sour cream flavored ruffled potatoe chips",2.98,6,"https://www.quill.com/is/image/Quill/s1063181_s7?$img400$");

        //delete db data
        chipsRepo.deleteAll();

        List<chip> chips = Arrays.asList(kettle,veggie,sunchip,popchip,doritos,bbq,stax,takis,ruffles);

        chipsRepo.saveAll(chips);
    }

}
