class ForestSafariRunner {

    public static void main(String safari[]) {
        System.out.println("Main Started");

        ForestSafari jimCorbett = new ForestSafari(1, "Jim Corbett", "Uttarakhand", 200, 520.8, true);
        jimCorbett.getSafariDetails();

        ForestSafari ranthambore = new ForestSafari(2,"Ranthambore", "Rajasthan",350, 1334.0, true);
        ranthambore.getSafariDetails();

        ForestSafari kaziranga = new ForestSafari(3, "Kaziranga", "Assam", 2000, 884.0, true);
        kaziranga.getSafariDetails();

        ForestSafari sundarbans = new ForestSafari(4, "Sundarbans","West Bengal", 500, 2585.0, false);
        sundarbans.getSafariDetails();

        ForestSafari bandhavgarh = new ForestSafari(5, "Bandhavgarh", "Madhya Pradesh", 400, 1536.0, true);
        bandhavgarh.getSafariDetails();

        ForestSafari gir = new ForestSafari(6, "Gir Forest", "Gujarat", 600,1412.0,true);
        gir.getSafariDetails();

        ForestSafari tadoba = new ForestSafari(7,"Tadoba", "Maharashtra", 450, 625.0, true);
        tadoba.getSafariDetails();

        ForestSafari pench = new ForestSafari(8, "Pench", "Madhya Pradesh", 500, 758.0, true);
        pench.getSafariDetails();

        ForestSafari kanha = new ForestSafari(9, "Kanha", "Madhya Pradesh", 600,940.0, true);
        kanha.getSafariDetails();

        ForestSafari satpura = new ForestSafari(10, "Satpura", "Madhya Pradesh", 300, 1339.0, true);
        satpura.getSafariDetails();

        ForestSafari periyar = new ForestSafari(11, "Periyar", "Kerala", 500, 925.0, false);
        periyar.getSafariDetails();

        ForestSafari nagarhole = new ForestSafari(12, "Nagarahole","Karnataka", 800, 847.0, true);
        
        nagarhole.getSafariDetails();

        ForestSafari bandipur = new ForestSafari(13, "Bnadipur","Karnataka", 700, 874.0, true);
        bandipur.getSafariDetails();

        ForestSafari bannerghatta = new ForestSafari(14, "Bannergatta", "Bnagalore", 250, 260.0, true);
        bannerghatta.getSafariDetails();

        ForestSafari rajaji = new ForestSafari(15, "Rajaji", "Uttarakhand", 300, 820.0,false);
        rajaji.getSafariDetails();

        ForestSafari sariska = new ForestSafari(16, "Sariska","Rajasthan",350, 866.0,true);
        sariska.getSafariDetails();

        ForestSafari dibruSaikhowa = new ForestSafari(17, "Dibru-Saikhowa", "Assam", 150, 765.0, false);
        dibruSaikhowa.getSafariDetails();

        ForestSafari chitwan = new ForestSafari(18,"Chitwan","Nepal", 500, 952.6, true);
        chitwan.getSafariDetails();

        ForestSafari yala = new ForestSafari(19, "Yala","Sri Lanka", 600, 978.8, true);
        yala.getSafariDetails();

        ForestSafari masaiMara = new ForestSafari(20,"Masai Mara","Kenya",1200,1510.0, true);
        masaiMara.getSafariDetails();

        System.out.println("Main Ended");
    }
}
