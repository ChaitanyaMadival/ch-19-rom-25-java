package com.xworkz.inheritance;

import com.xworkz.inheritance.army.protector.Protector;
import com.xworkz.inheritance.army.soldier.Soldier;
import com.xworkz.inheritance.bottle.bottle.Bottle;
import com.xworkz.inheritance.bottle.plastic.Plastic;
import com.xworkz.inheritance.browser.firefox.FireFox;
import com.xworkz.inheritance.browser.webbrowser.WebBrowser;
import com.xworkz.inheritance.businessman.businessman.Businessman;
import com.xworkz.inheritance.businessman.tata.RatanTata;
import com.xworkz.inheritance.cellphone.device.Device;
import com.xworkz.inheritance.cellphone.phone.Phone;
import com.xworkz.inheritance.choclate.choclate.Chocolate;
import com.xworkz.inheritance.choclate.dairymilk.DairyMilk;
import com.xworkz.inheritance.cloth.cloth.Cloth;
import com.xworkz.inheritance.cloth.shirt.Shirt;
import com.xworkz.inheritance.cosmetic.cosmetic.Cosmetic;
import com.xworkz.inheritance.cosmetic.lipstick.Lipstick;
import com.xworkz.inheritance.country.country.Country;
import com.xworkz.inheritance.country.india.India;
import com.xworkz.inheritance.cricket.cricketer.Cricketer;
import com.xworkz.inheritance.cricket.player.Virat;
import com.xworkz.inheritance.doctor.doctor.Doctor;
import com.xworkz.inheritance.doctor.surgeon.Surgeon;
import com.xworkz.inheritance.flower.flower.Flower;
import com.xworkz.inheritance.flower.lotus.Lotus;
import com.xworkz.inheritance.furniture.furniture.Furnitature;
import com.xworkz.inheritance.furniture.table.Table;
import com.xworkz.inheritance.game.bgmi.Bgmi;
import com.xworkz.inheritance.game.game.Game;
import com.xworkz.inheritance.hero.actor.Actor;
import com.xworkz.inheritance.hero.vishnuvardhan.VishnuVardhan;
import com.xworkz.inheritance.hospital.apollo.Apollo;
import com.xworkz.inheritance.hospital.hospital.Hospital;
import com.xworkz.inheritance.institute.institution.Institution;
import com.xworkz.inheritance.institute.xworkz.Xworkz;
import com.xworkz.inheritance.language.kannada.Kannada;
import com.xworkz.inheritance.language.language.Language;
import com.xworkz.inheritance.laptop.hp.Hp;
import com.xworkz.inheritance.laptop.laptop.Laptop;
import com.xworkz.inheritance.mall.mantrisquare.MantriSquare;
import com.xworkz.inheritance.mall.shoppingmall.ShopingMall;
import com.xworkz.inheritance.medical.dolo.Dolo;
import com.xworkz.inheritance.medical.medicine.Medicine;
import com.xworkz.inheritance.movie.comedy.Comedy;
import com.xworkz.inheritance.movie.genre.MovieGenr;
import com.xworkz.inheritance.shoe.bata.Bata;
import com.xworkz.inheritance.shoe.brand.Brand;
import com.xworkz.inheritance.show.podcast.Podcast;
import com.xworkz.inheritance.show.show.Show;
import com.xworkz.inheritance.stationary.shrihari.SriHari;
import com.xworkz.inheritance.stationary.stationary.Stationery;
import com.xworkz.inheritance.utensil.spoon.Spoon;
import com.xworkz.inheritance.utensil.utensil.Utensil;
import com.xworkz.inheritance.vegitable.carrot.Carrot;
import com.xworkz.inheritance.vegitable.vegitable.Vegetable;
import com.xworkz.inheritance.worker.farmer.Farmer;
import com.xworkz.inheritance.worker.worker.Worker;

public class InheritanceRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        // Soldier soldier = new Soldier();
       // Protector protector = new Protector();
        Soldier soldier = new Soldier();
        Protector protector = new Soldier();
        protector.giveProtection();

       // Plastic plastic = new Plastic();
        Bottle bottle = new Bottle();
        Plastic plastic = new Bottle();
        plastic.fillWater();

        FireFox fireFox = new FireFox();
        WebBrowser browser = new FireFox();
        browser.toBrowse();

        RatanTata tata = new RatanTata();
        Businessman businessman = new RatanTata();
        businessman.doBusiness();


        Phone phone = new Phone();
        Device device = new Phone();
        device.doPhoneCall();

        DairyMilk dairyMilk = new DairyMilk();
        Chocolate chocolate = new DairyMilk();
        chocolate.manufactureChocolates();

        Shirt shirt = new Shirt();
        Cloth cloth = new Shirt();
        cloth.produceCloth();

        Lipstick lipstick = new Lipstick();
        Cosmetic cosmetic = new Lipstick();
        cosmetic.sellBeautyProducts();

        India myNation = new India();
        Country country = new India();
        country.isMyCountry();

        Virat virat = new Virat();
        Cricketer cricketer = new Virat();
        cricketer.playsCricket();

        Surgeon surgeon = new Surgeon();
        Doctor doctor = new Surgeon();
        doctor.doTreatment();

        Lotus lotus = new Lotus();
        Flower flower = new Lotus();
        flower.doDecoration();

        Table table = new Table();
        Furnitature furnitature = new Table();
        furnitature.makeFurniture();

        Bgmi bgmi = new Bgmi();
        Game game = new Bgmi();
        game.palyGame();

        VishnuVardhan vishnu = new VishnuVardhan();
        Actor actor = new VishnuVardhan();
        actor.doActing();

        Apollo apollo = new Apollo();
        Hospital hospital = new Apollo();
        hospital.treatPatient();

        Xworkz xworkz = new Xworkz();
        Institution institution = new Xworkz();
        institution.provideGuidance();

        Kannada kannada = new  Kannada();
        Language language = new Kannada();
        language.toSpeak();

        Hp hp = new Hp();
        Laptop laptop = new Hp();
        laptop.toCode();


        MantriSquare mantriSquare = new MantriSquare();
        ShopingMall mall = new MantriSquare();
        mall.toShop();

        Dolo dolo = new Dolo();
        Medicine medicine = new Dolo();
        medicine.toCure();

        Comedy comedy = new Comedy();
        MovieGenr genr = new Comedy();
        genr.watchMovie();


        Bata bata = new Bata();
        Brand brand = new Bata();
        brand.sellShoes();

        Podcast podcast = new Podcast();
        Show show = new Podcast();
        show.shareInformation();

        SriHari sriHari = new SriHari();
        Stationery stationery = new SriHari();
        stationery.sellItems();

        Spoon spoon = new Spoon();
        Utensil utensil = new Spoon();
        utensil.toFeed();

        Carrot carrot = new Carrot();
        Vegetable vegetable = new Carrot();
        vegetable.makeSalad();

        Farmer farmer = new Farmer();
        Worker worker = new Farmer();
        worker.produceCrop();


        System.out.println("main ended");
    }
}
