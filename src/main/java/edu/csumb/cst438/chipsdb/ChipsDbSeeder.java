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

        chip kettle = new chip("Honey Dijon Kettle Chips","Tangy Mustard seeks Love at first bite",2.61,10,Arrays.asList("https://cdn.shopify.com/s/files/1/0558/1897/products/0003759_kettle-honey-dijon-chip.jpg?v=1450320427", "http://www.snackeroo.com/wp-content/uploads/DSC07082-1024x7681-e1448175647904.jpg","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6S8Uhn9LXrM8VzZYcClAyqJ2oEAAFjmkaQtIdh35CW1Vu3YguHQ"));
        chip veggie = new chip("Garden Veggie Straws","Sea Salt 30% less fat",2.99,3,Arrays.asList("https://target.scene7.com/is/image/Target/GUEST_f11ee439-aaea-425d-aad9-0d9377e20dbe?wid=488&hei=488&fmt=pjpeg","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7GtdCaDgLEQCxq-EesJ1MM3fC_ybse861LS4tGuJxRM_clDrE","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBDFeEM87OWEcuAjtXvH9J_KuPK92YEzfBPIz7YnhSXXg-SBEZAQ","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLPjXyiHs9YPJWkKw0I1TEuQEIu5UwksW1nrLQU07VMovP5SQq"));
        chip sunchip = new chip("Harvest Cheddar Sunchips","Whole grain snack",3.29,5,Arrays.asList("https://www.dollargeneral.com/media/catalog/product/cache/image/700x700/e9c3970ab036de70892d86c6d221abfe/0/0/00028400147392_0.jpg","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2uYmu-xGEd1iuDx-1rQPO2ZYZgLeZHYKERVcLbyIks85llY8FGw","https://farm1.static.flickr.com/74/215338954_566ee1dabc_b.jpg"));
        chip doritos = new chip("Cool Ranch Doritos ","Cool Ranch flavored tortilla Chips",2.89,12,Arrays.asList("https://images-na.ssl-images-amazon.com/images/I/91elpTzstuL._SY355AA355_PIbundle-64,TopRight,0,0_AA355_SH20_.jpg","http://www.snackeroo.com/wp-content/uploads/092-1024x7683-1024x768.jpg","https://www.taquitos.net/im/sn-closeup/closeup-Doritos-Locos-Ranch.jpg"));
        chip bbq = new chip("Lays Barbecue Chips","Tangy Barbeque flavored potatoe chips",3.19,3,Arrays.asList("https://images-na.ssl-images-amazon.com/images/I/51BJX9eAVIL.jpg","https://s23991.pcdn.co/wp-content/uploads/2013/05/barbecue-potato-chips-recipe.jpg","https://www.tasteofhome.com/wp-content/uploads/2018/03/000_0401-1-1024x684.jpg"));
        chip stax = new chip("All American Cheeseburger Stax","Lays All American Cheeseburger flavored Staxs",1.48,8,Arrays.asList("https://i5.walmartimages.com/asr/a0ec74b4-552e-4fa7-a051-89fe78939f6c_1.5a4c450f5cd8d9087438e4d380471ee3.jpeg?odnHeight=450&odnWidth=450&odnBg=FFFFFF","https://www.taquitos.net/im/sn-closeup/closeup-Doritos-Locos-Ranch.jpg","https://i.ytimg.com/vi/XBvuezuUB70/maxresdefault.jpg"));
        chip takis = new chip("Takis Fuego","Barcels spicy, mini, roll-shaped, tortilla corn chips ",2.79,5,Arrays.asList("https://static.meijer.com/Media/075/75280/0757528008680_a1c1_0600.png","https://www.trickstrend.com/wp-content/uploads/2018/08/po0emrbwg0d.jpg","https://i.pinimg.com/originals/c5/7f/2c/c57f2cfcdd34542e355f6cca36066782.jpg","https://girlyreviewcom.files.wordpress.com/2017/10/20140509-mexican-snacks-takis-thumb-610x429-401281.jpg?w=840"));
        chip ruffles = new chip("Cheddar & Sour Cream Ruffles","Cheddar and sour cream flavored ruffled potatoe chips",2.98,6,Arrays.asList("https://www.quill.com/is/image/Quill/s1063181_s7?$img400$","https://i.ytimg.com/vi/0TN8HbC3MSA/maxresdefault.jpg","https://www.fritolay.com/images/default-source/masstransit-nutrition-panel/ruffles-cheddar-sour-cream.jpg?sfvrsn=168f573a_6"));

        //delete db data
        chipsRepo.deleteAll();

        List<chip> chips = Arrays.asList(kettle,veggie,sunchip,doritos,bbq,stax,takis,ruffles);

        chipsRepo.saveAll(chips);
    }

}
