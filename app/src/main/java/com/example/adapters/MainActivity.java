package com.example.adapters;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


//badna net3alam eshya aye application bekoun mawjoud feha hal she
//l houne:
//spinner,gridview,listview
//houne bekoun majmo3a mn data bten3ered b de5lo

//list view:3ebara 3an ka2eme ela 3amoud wa7ad w bte3red majmo3a mn data
//grid view:3ebra 3an shabke nafs list view bas b akatr mn 3amoud
//spiner:heye ka2eme btkbous 3lyha bebyn 3andak data le m5azena

//ne7na shofnehoun haw koloun bl xml bas mesh ka programing
//xml hay tare2a 8alat l2no l programing bekoun mano 3arfen sho bado y5azen feha ya3ne momken yjeeb l programing mn 5elel database 2aw yjeba mn l interent
//fa hala2 badna net3alm tare2a l programing way
//fe kamen 3onsour nafsoun la haw l tlete esmo recycle view ba3den mne7ke 3ana


//la nefham haw koloun spinner,gridview,listview lezm awl she nefham she esmo adapter

//adapter ya3ne mo7awel


/*2awl she t5ayal 3ana data m5zane b array list msln {ahmad,khaled,ali,omar} data hawde ne3tebroun asme2 tolab

l matloub mene eno en2ol haw l asme2 3ala list view 3ashen 2o3roda 3ala shshe bheed shakl:
ahmad
omar
khaled
ayman
ali

bade 2a3ml hay l 3amlye btare2a programing

2alak la ta3mel hay l 3amlye programing lezm testa5dem she esmo adapter ya3ne l mo7awel

adapter heye she waset  btkoun been l data ta3etak w listview
listview   adapter    Arraylist(data)

ya3ne adapter been data w l 3onour yale badak to3roud fe l baynet ta3etak

2alak enta bkoul sohoule feek t5azen data b 2aye wa7ad listview,spinner,gridview bas 3ashen enta te2dar tet3mel ma3 kol l 3anaser b namat wa7ad b shakl wa7ad 7a nesta3ml adapter

ya3ne enta bas 7a tjehez l data  w tjhez l adapter w list view la7al 7a tkoun jehze testa2bel hay data ba3d heek iza badak t8ayer la spinner 2aw grid view ma 7a t8ayer la bel adapter wala bel data 7a ydalo metl ma houne

fa l fekra 3ashen ywa7do ta3moul ma3 kol l 3anaser 3mlo class waset esmo adapter 3ashen enta ka most5dem tersel l data la class l adapter w list view w kel l 3anaser le b2alba 7a tkoun jehze testa2bel data mn heed l adapter



exmple keef momken ykoun 3andak meshkle law ma fe adapter:

enta 3mlt application feha ka2met 2asme2 w bten3ered 3ala listview w enta 3mlt l adapter
ba3d senen google nazlet 3onsour jdeed mtl l listview w 7abet testa5dmo fa hal enta motar terja3 t3adel bel code l adapter w l data le 3andk la2 ma byelzm t3del 3ala aye she kel le badak ta3mlo enta t8ayer mn listview la msln Xview


addapter:heye no2ta le bterbout  data bel 3onour yale badak to3roud feha data(listview,spinner..etc)




adapter 3ando 4 function ra2seye:

haw l 4 function heye le bte7koun seer l 3amlyet bde5el l addapter

1-int getCount():function btraje3 integer btraje3 3adad l 3anaser l b2alb l masfoufa ya3ne(array list,array) mesh enta ba3t l array list 3ala l adapter fa keef bado ya3ref listview kam 3onour yohjouz mn 5elel hay l function bjeeb 3adad data b2alb l array list w bye7joz b2alb l listview nafs l 3ada le tele3 ma3o bel array list
2-object getitem(int):finction btraje3 object w bte5od l index ta3el l arraylist ya3ne l postion w btraje3 3onsour mo3ayan de5el l masfoufe b2alb l array list la n22ol 2awl 3onour bel array list fe ahmad w enta stad3et hay l function w 7atet postion 0 so 7a traje3lak ahmad hay function e5terye
3-long getItemId(int):btraje3 long w bte5od integer postion ta3el l l masfoufe arraylist w btraje3 l id ta3elo
4-View getView(int,view,viewgroup):ahm function btraje3 view w bte5od inttegr, view,viewgroup w btraje3:
-btjeeb l tasmem le ana 3mlto 3ala janab w bta7oto b2alb listview bta3mlo infalte
-bta3mel na2l lel 3onour w lel 3anaser bde5lo
-btjeeb data mn l masfofe ya3ne arraylist,array
-ta3be2et l data l jeba b2alb l 3anaser le jeba


ya3ne btjeeb l design le ana 3mlto le fe b2albo masln(imge,text,veiw) w bt7oto b2alb kel 3onour b2alb l listview ya3ne bta3mlo inflate w btjeeb l data mn array list w bt7otoun bkel 3onour bel listview
ya3ne btjeeb tasmem la 2awl 3onour bel listview w bt7ot data l mo2ebele elo
btjeeb tasmem la tene 3onour bel listview w bt7ot data le mo2eble elo
heeeeek la kel l 3anser le 3ande...




*/












//7a 2a3ml exmple baseet hala2 bshe jehez mesh costume


//step 1:brou7 3al xml w ba3mel listview w b7etola id
//step 2:beje 3al java file w ba3mel infalte lal list view
//step 3:bjhez data yale bade 2o3rouda b array list,array..etc bjaheza
//step 4:b3abe data yale bade yeha b2al l array list
//step 5:lezm jahez l adapter bas ana hala2 7a esta3ml adpter jehez esmo ArrayAdapter
//step 6:bersel data lal adpter ya3ne beb3lo l array list


public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inlate
        listView=findViewById(R.id.list_view);


        //array list to store data ana bade 5azen asme2 ya3ne array list of type string

        ArrayList<String> names = new ArrayList<>();

        //store names
        names.add("khaled");
        names.add("ahmad");
        names.add("shadi");
        names.add("ali");

        //hala2 bade est3ml adapter jehez esmo ArrayAdpter howe mano costume jehez byetst3mlo lal eshya l baseta masln bas asme2 bas iza keen fe sowar w heek mamnest3mlo

        //mn7aded naw3o ne7na 7atyna string 3ashen yefham l adapter l mawjoud bel 4 function le mawjoud fe eno ana 3am et3mela ma3 string 3ashen msln bas 2olo getitem 7a yraje3le string no3 l output ta3el getitem byet8ayar 7asab ana sho bade howe bekoun object berjae3 bas ana  sho b7aded bel adapter byet8ayar houn iza 7atytelo string 7a yseer yraje3 string 7asab nou3 generic type jowa class le 5asen bel Arrayadapter

        //array adapter bye5od 3ande 3 sha8let
        /*
        1-2awl sah8le l context yale badak tet3mal ma3a ya3ne l adapter bado yet3ml ma3 lista l context heeda ween la7 ykoun m3araf 3ala l context l ana fe ya3ne this l howe l activity le ana sha8al feha lesh ana beb3at l context? 3ashen fe 3ande function esma getview 2olna btrkeb design 3ala list view  ya3ne bt3ml inflate lal 3anser fa 3ashen ta3mel inflate lezm ta3ref ta3ref l context
        2-tene sha8le bade eb3ato howe l id taba3 l 3onour yale bade 2o3rod ya3ne enta 3andak data w 3andak list view b2albo fe 3anser tyeb heed l 3onour shop fe b2albo textview,edit text,button 3aahn lama yesta3ml getview w ya3mel inflate ya3ref sho bado yo3roud bel zabt hala2 ne7na bel 3ade mna3ml tasmem 3ala janab w mna3te l id bas hala2 7a nest3ml she jeheze ana bade 2o4oud esm ya3ne textview fa b2olo fe she jehez esmo androud.R.Layout.simple_list_item_1,l 3onsour heda 3ebra 3an textview ya3ne l 3nsour nafso bado yen3ered fe l esm l esm ma byen3ered bel hawa lezm t7adedlo l 3onsour yale bado yen3ered fe l esm
        3-heye 3ebra 3an data yale badak to3rodlo yeha fa houn bteb3tlo l array list le enta 3mlta


         */








        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,names);

        //note:l arraylist fe b2albo 3onsour wa7ad le howe name fa howe telka2eyan fehem eno list view fe b2albo kamen 3onsour wa7ad le howe textview fa telk2yan 7a yefham eno kol 3onsour bel array list 7a yen7at b text view fa masln l 3onour l 2awl 7a yeje ya3mel infalte la textview 7a yjeeb 2awl 3onsour bl array list w y7ota feha tene 7a ya3mel infalte la textview w 7jeeb l 3onsour tene bel array list w y7ota bel textview....etc
        //e5er she b2olo lal list view eno 5ale l adaptar ta3elak howe heed
        listView.setAdapter(adapter);

        //listview byrt3emal ma3 adapter wl array list btet3emal ma3 adpter fa sar howe l waset been list view wl adapter






        //hala2 ba3d ma 3mlna heek badna nshof sho sar bel zabt w keef mshena bel zabt:

        /*

            ana jahzt l array list w ba3telo data
            w ba3den jahzt l arrayadapter w ba3telo 3 sha8let:
            context,
            w l id taba3 l 3onsour yale bado ykoun namat la kel l 3anser l b2alb list view bas ntebh heda id mesh id text view la2 heed l id taba3 design kolo ya3ne layout
            ,w telet sha8le ba3ata heye l data le bada ten3ered 3ala textview fa kel text view 7a yen3ered b2albo name


            w 2e5er she ba3at l adapter la listview


            hala2 keef bteshte8l

            2awl ma l application bteshte8l ya3ne system yblesh bten3ered l list view
            list view mesh 7a yo3reoud l 3anaser le b2alb l arraylist mara wa7de l2no ana 3ande b2alb l arraylist 8 3anser yemken shshe le 3ande ma btse3 8 3anser yemken btsee3 bas 4 3anser fa howe berou7 by3oroud 2awl 4 w ba3den lama l user ya3mel scroll la ta7t byen3ardo l 4 tenyen

            fa hala2 ne7na 7a nefterd eno shshe ma btsee3 8eer la 4 w ne7na 3ana 8 3anser b2alb l arraylist


            fa 2awl l getcount():method 2awl she 7a traj3le toul l array list fa 7a trja3le 8 fa yen7ajaz 8 ma7let b2alb l listview
            fa l user iza 3mel scroll 7a ydal yestad3e l getview 7ata yosalo 8

            l getview sho bta3mel bte5od 3 parameter w btraje3 view object mn view mn2osoud b view tasmem nafso ta3el kel 3osnour
             l 3 parameter sho houne
             int:howe l index hala2 ne7na metl ma 2olna l shshe btsee3 4 fa 7a ykoun 2awl 3onour l index ta3elo 0,tene wa7ad ra2mo 1,telet 2,rabe3 3 fa hala2 sho 7yseer 3end kol 3onour mn l 3anser l 4 ya 7rou7 yestad3e getview() fa 3end l 3onsour l 2awl 7a yrou7 yestd3e l getview w yeb3at l parametr l monesbe la heed l 3onour w heek 3end l 4 3anser 2awl parametr 7a ykoun l index fa 7a yestd3eha 3end 2awl 3onsour w yeb3tla l index 0,3onsour tene 7a yestd3eha w yeb3at 1 ,3onsour telet 7a yestd3eha w yeb3at 2..etc la 3end 4 3onsour
             view:tyeb sho howe l view le byenbe3et ma3 l getvew() ne7na 2awl mara badna nestd3e l getview() l view howe l 3onsour 3al shshe b2alb listview tyeb ne7na 2awl mara mneb3at fa ma fe lisa 3onsour fa 7ykoun null tyeb hal momken ma tkoun null eh iza ne7na balshna l app w nzelna la ta7t 3mlna scroll down ba3den tel3na 3mlna scroll up fa 7a yestd3e l getview masln la 2awl 3onosour bas 7a ykoun fe 3onsour fa 7eb3tlo l 3osnour ma 7a yeb3tlo null
             viewgroup:howe l ab le 7a ykoun ma3roud fe l 3anser ta3el tasmem le ana 3mlto


             fa 2awl ma nblesh 7a yeb3at l getview fa 2lna 2awl she bya3mlo l getview bjeeb l 3onsour fa ra7 la yjeeb l 3osnour 2awl mara fa yestd3e l getview() fa 7a yeb3at la 2awl 3onosour l index tene wa7ad l view 7a ykoun null lesh l2no jeye w listview ba3da fadye fa y2olo jeeb l design 3mlo inflate w 7ot design b2albo la heed l 3onsour iza ma keen fade ya3ne 3emlo inflate abl heed bas ana 3mlt scroll down rej3 scroll up fa ma7ykoun null fa ana ba3melo shart iza ken l view null 3mlo inflate ma keen null ma ta3mlo inflate
             ba3d heek bade rou7 jeeb l data mn l array list enta 3andak l index 0 fa 7a trou7 3al array list w tjeeb data le bl index 0 w ba3den la7 teje w t3abe lal 2awl 3onsour bel listview w ba3mel return mn get view brou7 heed l 3onsour le fe data w byerkab 3al tasmem le howe list view
             ba3den 7a yrou7 3al 3onsour tene 7a yjeeb l view nafsa w yjeeb l 3onsour ya3mlo inflate w yrakbo 3al view  w ba3den 7a yjeeb data w yrakeba 3lee 7a yerja3 ya3mel return w yrakeba 3al listview
             w hyda loop 7a yrou7 3ala kel l 3anser telet w rabe3 la y5als l 4 3anser
             hala2 law l user 3emel scroll nezel la ta7t l 3anaser l 4 batalo mbynen fo2 fa yerja3 yestad3e l get view l index 4 w yjeeb l view w ya3ml inflate lal textview w yrakeba  yerja3 yjeeb data w yrakeb data w ya3mel return w y7ota ma7ala
             la kel l 3anaser l 4 l be2yen bew2ef la7ed ma yseer ad l return value ta3el getcount() l heye 8



             tyeb aymta ma byelzmne 2a3mel inflate?
             t5ayal eno 3arad l 8 kola hala2 meshe l 7al
             fa l user reje3 3ml scroll w tele3 la fo2 fa yerja3 ybyno l 3anaser l 4 l 2awl she 3mltoun fa yerja3 yestd3e l getview mara tenye 3ashen iza bade 7ades l data fa btesd3e l get view w byeb3lk l 3onsour le feh data l 3onsour kolo kemel byoslk l tasmem nafso l fe textview fa ma 7ykoun l parameter tene null 7a ykoun l view kolo fa ne7na ma 7a na3ml inflate 7a n2olo shart iza view=null inflate iza la2 7ades l bayanet bas bhay l 7ale bas 7a y7ades l bayanet






            5ale belak sha8le eno 4 function hawde call back mesh enta btestd3ehoun hone a7loun byestd3o



         */

    }

}