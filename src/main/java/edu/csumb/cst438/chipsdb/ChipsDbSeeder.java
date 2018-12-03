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
        chip kettle = new chip("Kettle","{Insert description}",2.50,10,"https://cdn.shopify.com/s/files/1/0558/1897/products/0003759_kettle-honey-dijon-chip.jpg?v=1450320427");
        chip veggie = new chip("Garden","{Insert description}",2.50,3,"https://target.scene7.com/is/image/Target/GUEST_f11ee439-aaea-425d-aad9-0d9377e20dbe?wid=488&hei=488&fmt=pjpeg");
        chip sunchip = new chip("Sun Chip","{Insert description}",2.50,5,"https://www.dollargeneral.com/media/catalog/product/cache/image/700x700/e9c3970ab036de70892d86c6d221abfe/0/0/00028400147392_0.jpg");
        chip popchip = new chip("Popchips","{Insert description}",2.50,7,"https://d2lnr5mha7bycj.cloudfront.net/product-image/file/large_ef9a47fb-68b5-40ad-b88c-003db2b43e4e.jpg");
        chip doritos = new chip("Doritos","{Insert description}",2.50,12,"https://images-na.ssl-images-amazon.com/images/I/91elpTzstuL._SY355AA355_PIbundle-64,TopRight,0,0_AA355_SH20_.jpg");
        chip bbq = new chip("Barbecue Chips","{Insert description}",2.50,3,"https://images-na.ssl-images-amazon.com/images/I/51BJX9eAVIL.jpg");
        chip stax = new chip("Lays","{Insert description}",2.50,8,"https://i5.walmartimages.com/asr/a0ec74b4-552e-4fa7-a051-89fe78939f6c_1.5a4c450f5cd8d9087438e4d380471ee3.jpeg?odnHeight=450&odnWidth=450&odnBg=FFFFFF");
        chip takis = new chip("Barcel","{Insert description}",2.50,5,"https://static.meijer.com/Media/075/75280/0757528008680_a1c1_0600.png");
        chip ruffles = new chip("Ruffles","{Insert description}",2.50,6,"https://www.quill.com/is/image/Quill/s1063181_s7?$img400$");


        //delete db data
        chipsRepo.deleteAll();

        List<chip> chips = Arrays.asList(kettle,veggie,sunchip,popchip,doritos,bbq,stax,takis,ruffles);

        chipsRepo.saveAll(chips);
    }

}