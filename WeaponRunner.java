class WeaponRunner {

    public static void main(String weapon[]) {
        System.out.println("Main Started");

        Weapon w1 = new Weapon(1, "Katana","Sword","Japan", "Steel", "Combat");
		/*
        w1.id = 1;
        w1.name = "Katana";
        w1.type = "Sword";
        w1.origin = "Japan";
        w1.material = "Steel";
        w1.usage = "Combat";
		*/
        w1.getWeaponDetails();

        Weapon w2 = new Weapon(2,"AK-47", "Rifle", "Russia", "Steel & Wood", "War");
        w2.getWeaponDetails();

        Weapon w3 = new Weapon(3, "Longbow", "Bow","England","Yew Wood","Hunting");
        w3.getWeaponDetails();

        Weapon w4 = new Weapon(4, "Grenade", "Explosive", "France", "Metal", "Attack");
        w4.getWeaponDetails();

        Weapon w5 = new Weapon(5, "Spear", "Polearm", "Various","Wood & Steel", "Hunting/War");
        w5.getWeaponDetails();

        Weapon w6 = new Weapon(6, "Crossbow", "Ranged", "China","Wood & Metal","Warfare");
        w6.getWeaponDetails();

        Weapon w7 = new Weapon(7, "Flamethrower", "Chemical", "Germany","Metal","Assault");
        w7.getWeaponDetails();

        Weapon w8 = new Weapon(8, "Mace", "Blunt","Medieval Europe", "Iron","Close Combat");
        w8.getWeaponDetails();

        Weapon w9 = new Weapon(9, "Bayonet","Blade", "France","Steel", "Rifle Attachment");
        w9.getWeaponDetails();

        Weapon w10 = new Weapon(10, "Nunchaku", "Martial Art", "Okinawa", "Wood & Chain", "Training/Defense");
        w10.getWeaponDetails();

        Weapon w11 = new Weapon(11, "Tanto","Dagger", "Japan","Steel","Stealth Combat");
        w11.getWeaponDetails();

        Weapon w12 = new Weapon(12,"Bazooka","Rocket Launcher", "USA","Alloy", "Anti-Tank");
        w12.getWeaponDetails();

        Weapon w13 = new Weapon(13, "Shuriken", "Throwing Star", "Japan", "Metal", "Stealth");
        w13.getWeaponDetails();

        Weapon w14 = new Weapon(14,"Trident","Polearm","Ancient Greece", "Bronze","Combat/Fishing");
        w14.getWeaponDetails();

        Weapon w15 = new Weapon(15, "Musket","Firearm", "Europe", "Wood & Iron", "Early Warfare");
        w15.getWeaponDetails();

        Weapon w16 = new Weapon( 16, "Scythe","Blade","Agrarian","Steel","Symbolic/Modified Weapon");
        w16.getWeaponDetails();

        Weapon w17 = new Weapon(17, "Halberd","Axe-Spear Combo","Europe", "Wood & Iron", "Battlefield");
        w17.getWeaponDetails();

        Weapon w18 = new Weapon(18,"Boomerang","Throwing", "Australia", "Wood","Hunting/Sport");
        w18.getWeaponDetails();

        Weapon w19 = new Weapon(19, "Dirk", "Dagger", "Scotland", "Steel", "Close Combat");
        w19.getWeaponDetails();

        Weapon w20 = new Weapon(20, "Chakram", "Circular Blade", "India", "Steel","Throwing Weapon");
        w20.getWeaponDetails();

        System.out.println("Main Ended");
    }
}
