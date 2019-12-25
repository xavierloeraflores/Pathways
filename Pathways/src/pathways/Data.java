/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathways;

import static pathways.Data.stu1;

/**
 *
 * @author xavierloera
 */
public class Data {
        static Course blank = new Course("","____","",0.0,0.0,0);
        static Course cis007 = new Course("CIS007","Python Programming","CIS",3.0,1.0,
                2, true );
        static Course cis008 = new Course("CIS008","Advanced Python Programming",
                "CIS",3.0,1.0,2, true );
        static Course cis037a = new Course("CIS037A","Introduction to C Programming",
                "CIS",3.0,1.0,2, true );
        static Course cis040 = new Course("CIS040","C++ Programming",
                "CIS",3.0,1.0,2, true );
        static Course cis043 = new Course("CIS043","Software Dev w/ Java",
                "CIS",3.0,1.0,2, true );
        static Course cis044 = new Course("CIS044","Data Structures w/ Java",
                "CIS",3.0,1.0,2, true );
        static Course cis045 = new Course("CIS045","Linux Essentials I",
                "CIS",2.5,0.5,1, true );

        
        
        
        
        
        //Math
        static Course math903 = new Course("MATH903","Elementary Algebra", "MATH",
                3.0,0.0,0,true);
        static Course math00c =  new Course("MATH00C","Intermediate Alegbra","MATH",
                5.0,0.0,0,true, "MATH903"); 
        static Course math002 = new Course("MATH002","PreCalculus and Trignonmetry","MATH",
                6.0,0.0,2,true, "MATH00C");
        static Course math003a = new Course("MATH003A","Analytic Geometry and Calculus 1", "MATH",
                5.0,0.0,2,true,"MATH002");
        static Course math003b = new Course("MATH003B","Analytic Geometry and Calculus 2", "MATH",
                5.0,0.0,2,true,"MATH003A");    
        
        //Engineering
        static Course egr010 = new Course("EGR010","Introduction to Engineering",
                "EGR",3.0,1.0,2,true);
        static Course egr023 = new Course("EGR023","Mechanics - Statics",
                "EGR",3.0,0.0,2,false);
        static Course egr024 = new Course("EGR024","Introduction To Circuit Analysis",
                "EGR",3.0,1.0,2,false,"MATH003A");
        static Course egr030 = new Course("EGR030","Introduction to Computing for EGR",
                "EGR",3.0,1.0,2,true);
        //English
        static Course eng905ac = new Course("ENG905AC","Accelerated Essay Writing",
                "ENG",6.0,0.0,0, true);
        static Course eng908 = new Course("ENG908","Effective Writing",
            "ENG",3.0,0.0,0, true, "ENG905AC");
        static Course eng001a = new Course("ENG001A","English Composition",
                "ENG",3.0,0.0,2, false, "ENG908");
        static Course eng001b = new Course("ENG001B","English Composition and literature",
                "ENG",3.0,0.0,2, false, "ENG001A");
        
        static Course hed002 = new Course("HED002","Health and Lifestyle",
                "HED",3.0,0.0,2, true, "HED001");
             static Course phy002a = new Course("PHY002A","General Physics",
                "PHY",4.0,1.0,2, false );
     static Course phy004a = new Course("PHY004A","Engineering Physics-Mechanics",
                "PHY",4.0,1.0,2, false );
	 static Course phy004b = new Course("PHY004B","Engineering Physics-Electricity and Magnetism",
                "PHY",3.0,1.0,2, false );
	 static Course his004a = new Course("HIS004A","History of Western Civilization",
                "HIS",3.0,0.0,2, true );
     static Course his004b = new Course("HIS004B","History of Western Civilization",
                "HIS",3.0,0.0,2, true );
	 static Course his015 = new Course("HIS015","World History to 1500",
                "HIS",3.0,0.0,2, true );
	 static Course his015h = new Course("HIS015H","World History to 1500 - Honors",
                "HIS",3.0,0.0,2, true );
	 static Course his017a = new Course("HIS017A","History of the United States to 1877",
                "HIS",3.0,0.0,2, true );
	 static Course his017b = new Course("HIS017B","History of the United States Since 1877",
                "HIS",3.0,0.0,2, true );
	 static Course his020 = new Course("HIS020","History and Geography of California",
                "HIS",3.0,0.0,2, true );
	 static Course his031 = new Course("HIS031","History of East Asia",
                "HIS",3.0,0.0,2, true );
	 static Course rea054 = new Course("REA054","Critical College Reading and Thinking",
                "REA",3.0,0.0,1, false );
	 static Course rea961 = new Course("REA961","Building College Reading Strategies",
                "REA",2.5,0.5,0, true );
	 static Course art001a = new Course("ART001A"," Survey of Western Art 1",
                "ART",3.0,0.0,2, true );
	 static Course art001b = new Course("ART001B","Survey of Western Art 2",
                "ART",3.0,0.0,2, true );
	 static Course art001d = new Course("ART001D","Art of the 20th Century",
                "ART",3.0,0.0,2, true );
	 static Course art031a = new Course("ART031A","Drawing",
                "ART",2.0,1.0,2, true );
	 static Course art031b = new Course("ART031B","Intermediate Drawing",
                "ART",2.0,1.0,2, true );
	 static Course art033a = new Course("ART033A","Basic Design: Two-Dimensional",
                "ART",2.0,1.0,2, true );
	 static Course art033b = new Course("ART033B","Basic Design: Three-Dimensional",
                "ART",2.0,1.0,2, true );
	 static Course art034a = new Course("ART034A","Introduction to Digital Art",
                "ART",2.0,1.0,2, true );
	 static Course art034b = new Course("ART034B","Advanced Digital Art",
                "ART",2.0,1.0,2, true );
	 static Course art035a = new Course("ART035A","Life Drawing",
                "ART",2.0,1.0,2, true );
	 static Course art035B = new Course("ART035B","Life Drawing",
                "ART",2.0,1.0,2, true );
	 static Course art035c = new Course("ART035C","Life Drawing",
                "ART",2.0,1.0,2, true );
	 static Course art035d = new Course("ART035D","Life Drawing",
                "ART",2.0,1.0,2, true );
	 static Course art049a = new Course("ART049A","Painting",
                "ART",2.0,1.0,2, true );
	 static Course art049b = new Course("ART049B","Painting",
                "ART",2.0,1.0,2, true );
	 static Course art049c = new Course("ART049C","Painting",
                "ART",2.0,1.0,2, true );
	 static Course art049d = new Course("ART049D","Painting",
                "ART",2.0,1.0,2, true );
	 static Course art065a = new Course("ART065A","Ceramics-Handbuilding",
                "ART",2.0,1.0,2, true );
	 static Course art065b = new Course("ART065B","Ceramics-Handbuilding",
                "ART",2.0,1.0,2, true );
	 static Course art065c = new Course("ART065C","Ceramics-Handbuilding",
                "ART",2.0,1.0,2, true );
	 static Course art065d = new Course("ART065D","Ceramics-Handbuilding",
                "ART",2.0,1.0,2, true );
	 static Course art067a = new Course("ART067A","Ceramics-Potter's Wheel",
                "ART",2.0,1.0,2, true );
	 static Course art067b = new Course("ART067B","Ceramics-Potter's Wheel",
                "ART",2.0,1.0,2, true );
	 static Course art067c = new Course("ART067C","Ceramics-Potter's Wheel",
                "ART",2.0,1.0,2, true );
	 static Course art067d = new Course("ART067D","Ceramics-Potter's Wheel",
                "ART",2.0,1.0,2, true );
	 static Course art075a = new Course("ART075A","Metalsmithing",
                "ART",2.0,1.0,1, true );
	 static Course com001 = new Course("COM001","Public Speaking",
                "COM",3.0,0.0,2, false );
	 static Course com001h = new Course("COM001H","Public Speaking - Honors",
                "COM",3.0,0.0,2, false );
	 static Course com004 = new Course("COM004","Small Group Communication",
                "COM",3.0,0.0,2, false );
	 static Course com008 = new Course("COM008","Interpersonal Communication",
                "COM",3.0,0.0,1, true );
	 static Course com012 = new Course("COM012","Introduction to Intercultural Communication",
                "COM",3.0,0.0,2, false );
	 static Course com020 = new Course("COM020","Argumentation and Debate",
                "COM",3.0,0.0,2, false );
	 static Course com020h = new Course("COM020H","Argumentation and Debate - Honors",
                "COM",3.0,0.0,2, false );
	 static Course com025 = new Course("COM025","Mass Communication and Society",
                "COM",3.0,0.0,2, false );
	 static Course ecn001a = new Course("ECN001A","Principles of Macroeconomics",
                "ECN",3.0,1.0,2, false );
	 static Course ecn001b = new Course("ECN001B","Principles of Microeconomics",
                "ECN",3.0,1.0,2, false );
	 static Course ecn006 = new Course("ECN006","The Global Economy",
                "ECN",3.0,0.0,2, false );
	 static Course phi001 = new Course("PHI001","Introduction to Philosophy",
                "PHI",3.0,0.0,2, true );
	 static Course phi002 = new Course("PHI002","Introduction to Logic",
                "PHI",3.0,0.0,2, true );
	 static Course phi003 = new Course("PHI003","Introduction to Logic",
                "PHI",3.0,0.0,2, true );
	 static Course phi005 = new Course("PHI005","Introduction to Social and Political Philosophy",
                "PHI",3.0,0.0,2, true );
        
         
         
         
         
         
         
         
        
        public static Course[] masterlist = new Course[]{
blank, cis007, cis008, cis037a, cis040, cis043, cis044, cis045, math903,
            math00c, math002, math003a, math003b, egr010, egr023, egr024, 
            egr030, eng905ac, eng908, eng001a, eng001b, hed002, phy002a, 
            phy004a, phy004b, his004a, his004b, his015, his015h, his017a, 
            his017b, his020, his031, rea054, rea961, art001a, art001b, art001d, 
            art031a, art031b, art033a, art033b, art034a, art034b, art035a, art035B, 
            art035c,art035d,art049a, art049b, art049c, art049d, art065a, art065b, 
            art065c, art065d , art067a, art067b, art067c, art067d, art075a, com001, 
            com001h,com004,com008, com012, com020, com020h, com025, ecn001a, ecn001b,
            ecn006, phi001, phi002, phi003, phi005           
};
        static Course[]  cislist = new Course[]{cis008, cis037a,cis040,math903,math00c,egr030};
        static Course[]  egrlist = new Course[]{ egr010, egr023,egr024,egr030,phy004a, phy004b};
        static Course[]  mathlist = new Course[]{ math003a,math003b};
        static Course[]  mathlist3 = new Course[]{ cis037a, cis043, egr030};
        static Course[]  artlist2 = new Course[]{art033a, art033b, art035a, art034a, art065a};
        public static Course[]  artlist = new Course[]{art001a, art001b, art031a};
        public static Course[]  artlist3 = new Course[]{phi001, phi003, his004a, his004b};
        
        public static Courselist CIS1 = new Courselist(cislist,2,10);
        public static Courselist egr1 = new Courselist(egrlist,2,18);
        
        public static Courselist math1 = new Courselist(mathlist,1,8);
        public static Course[]  mathlist2 = new Course[]{ phy002a };
        public static Courselist math2 = new Courselist(mathlist2,1,4);
        
        public static Courselist math3 = new Courselist(mathlist3,1,4);
       
       public  static Courselist art1 = new Courselist(artlist,2,9);
        
        public static Courselist art2 = new Courselist(artlist2,1,3);
        public static Courselist art3 = new Courselist(artlist3,1,3);
        public static Course[] t1 = new Course[]{cis008, cis037a, math903, phi001,blank,blank,blank};
        public static Course[] t2 = new Course[]{cis040, art033b, math003a, phi003,blank,blank,blank};
        public static Course[] t3 = new Course[]{hed002, eng001a, cis045, art034a,blank,blank,blank};
        public static Course[] t4 = new Course[]{eng001b, his004a, math003b, art035a,blank,blank,blank};
        public static Course[] t5 = new Course[]{egr010, egr023, math00c, art065a,blank,blank,blank};
        public static Course[] t6 = new Course[]{egr024, egr030, phy004a, art001a,blank,blank,blank};
        public static Course[] t7 = new Course[]{egr010,com008 , his017b, art001b,blank,blank,blank};
        
        
        
        
        
        public static Courselist tt1 = new Courselist(t1,4,10);
        public static Courselist tt2 = new Courselist(t2,4,10);
        public static Courselist tt3 = new Courselist(t3,4,10);
        public static Courselist tt4 = new Courselist(t4,4,10);
        public static Courselist tt5 = new Courselist(t5,4,10);
        public static Courselist tt6 = new Courselist(t6,4,10);
        public static Courselist tt7 = new Courselist(t7,4,10);
        public static Student stuu = new Student("","","","","");
        
        public static Student stu1 = new Student("Kelly","Jelly","kellyjelly@gmail.com","pass","g0stu1",
        tt1,tt2,tt3);
        public static Student stu2 = new Student("Kevin", "Sticks", "Chops@gmail.com","pass","g0stu2",
                tt4,tt5,tt6);
        public static Student stu3 = new Student("Shawn","Brownman","Shawnyboy@gmail.com","pass","g0stu3");
        public static Student stu4 = new Student("Jack","Tran","JackTiger@gmail.com","pass","g0stu4");
        public static Student stu5 = new Student("Tony","Thompson","BMWKing@gmail.com","pass","g0stu5");
        public static Student stu6 = new Student("Gibby","Salazar","chapitoloco@gmail.com","pass","g0stu6");
        public static Student stu7 = new Student("Ray","Magday","heyman@gmail.com","pass","g0stu7");
        public static Student stu8 = new Student("Oscar","Smith","soul@gmail.com","pass","g0stu8");
        public static Student stu9 = new Student("","","","","");
        public static Student stu10 = new Student("","","","","");
        public static Student stu11 = new Student("","","","","");
        public static Student stu12 = new Student("","","","","");
        public static Student stu13 = new Student("","","","","");
        public static Student stu14 = new Student("","","","","");
        public static Student stu15 = new Student("","","","","");
        public static Student stu16 = new Student("","","","","");
        

        //static Courselist tt8 = new Courselist(t8,4,0);
        
        
        
        
        
        
        
        

        //stu.addTerm(, Data.tt);
        //stu.addTerm(, Data.tt);

        public static Student[] studentlist= new Student[]{stu1,stu2,stu3,stu4,
            stu5,stu6,stu7,stu8,stu9,stu10,stu11,stu12,stu13,
        stu14,stu15,stu16};    




}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
