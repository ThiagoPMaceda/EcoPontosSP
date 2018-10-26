package Ecopontos.fragments;

import android.Manifest;
import android.app.Fragment;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;

import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import thiagopmaceda.ecopontossp3.R;

public class GoogleMapsFragment extends Fragment implements OnMapReadyCallback {

    @Nullable
    private static final String TAG = "YOUR-TAG-NAME";
    private GoogleMap mMap;
    private static final int REQ_PERMISSION = 101;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mapa,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MapFragment fragment = (MapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);

    }

    @Override
        public void onMapReady (GoogleMap googleMap){

        MapsInitializer.initialize(getContext());
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        if (checkPermission())
            mMap.setMyLocationEnabled(true);
        else askPermission();


        LatLng engalberto = new LatLng(-23.5384647, -46.5468167);
        MarkerOptions marker1 = new MarkerOptions();
        marker1.position(engalberto);
        marker1.title(" Ecoponto - Eng Alberto");
        marker1.snippet("Av. Aricanduva, nº 200 - Sob Viad. Engº Alberto Badra");
        mMap.addMarker(marker1);
        // Coordenadas para os ecopontos de São Paulo. Total 75 marcadores.
        LatLng astarte = new LatLng(-23.5498419, -46.5246326);
        MarkerOptions marker2 = new MarkerOptions();
        marker2.position(astarte);
        marker2.title(" Ecoponto - Astarte");
        marker2.snippet("Rua Astarté, 500 - Vila Carrao");
        mMap.addMarker(marker2);

        LatLng novayork = new LatLng(-23.5873852, -46.5112531);
        MarkerOptions marker3 = new MarkerOptions();
        marker3.position(novayork);
        marker3.title("Ecoponto - Nova York");
        marker3.snippet("R. Acácio Antunes, 89 - Jardim das Rosas (Zona Leste I)");
        mMap.addMarker(marker3);

        LatLng santodias = new LatLng(-23.6639699, -46.7789717);
        MarkerOptions marker4 = new MarkerOptions();
        marker4.position(santodias);
        marker4.title("Ecoponto Santo Dias");
        marker4.snippet("Travessa Rosifloras, 301 - Conj. Hab. Instituto Adventista");
        mMap.addMarker(marker4);

        LatLng parquefernanda = new LatLng(-23.6718436, -46.7945441);
        MarkerOptions marker5 = new MarkerOptions();
        marker5.position(parquefernanda);
        marker5.title("Ecoponto Parque Fernanda");
        marker5.snippet("Av. Dr. Salvador Rocco, 400 - Parque Fernanda");
        mMap.addMarker(marker5);

        LatLng olinda = new LatLng(-23.6341011, -46.7602346);
        MarkerOptions marker6 = new MarkerOptions();
        marker6.position(olinda);
        marker6.title("Ecoponto Olinda");
        marker6.snippet("R. Nelsom Brissac, 1235 - Parque Regina");
        mMap.addMarker(marker6);

        LatLng beleza = new LatLng(-23.6381001, -46.7437524);
        MarkerOptions marker7 = new MarkerOptions();
        marker7.position(beleza);
        marker7.title("Ecoponto Beleza");
        marker7.snippet("R. Campo Novo do Sul - Vila Andrade");
        mMap.addMarker(marker7);

        LatLng cidadesaudavel = new LatLng(-23.6620712, -46.7247422);
        MarkerOptions marker8 = new MarkerOptions();
        marker8.position(cidadesaudavel);
        marker8.title("Ecoponto Cidade Saudável");
        marker8.snippet("R. Ptolomeu, 869 - Jardim São Luís (Zona Sul)");
        mMap.addMarker(marker8);

        LatLng alvarenga = new LatLng(-23.695472, -46.6536476);
        MarkerOptions marker9 = new MarkerOptions();
        marker9.position(alvarenga);
        marker9.title("Ecoponto Alvarenga");
        marker9.snippet("Estr. do Alvarenga, 2475 - Jardim Itapura");
        mMap.addMarker(marker9);

        LatLng cupece = new LatLng(-23.6654455, -46.6564103);
        MarkerOptions marker10 = new MarkerOptions();
        marker10.position(cupece);
        marker10.title("Ecoponto Cupecê");
        marker10.snippet("R. Anália Maria de Jesus, 131 - Jardim Itacolomi");
        mMap.addMarker(marker10);

        LatLng setorg = new LatLng(-23.5862483, -46.3986175);
        MarkerOptions marker11 = new MarkerOptions();
        marker11.position(setorg);
        marker11.title("Ecoponto Setor G");
        marker11.snippet("R. Alfonso Asturaro, 733 - Conj. Hab. Barro Branco II");
        mMap.addMarker(marker11);

        LatLng inaciomonteiro = new LatLng(-23.5733581, -46.4036858);
        MarkerOptions marker12 = new MarkerOptions();
        marker12.position(inaciomonteiro);
        marker12.title("Ecoponto Inácio Monteiro");
        marker12.snippet("R. Regresso Feliz, 1190 - Conj. Hab. Inacio Monteiro");
        mMap.addMarker(marker12);

        LatLng jardimsn = new LatLng(-23.5229967, -46.484946);
        MarkerOptions marker13 = new MarkerOptions();
        marker13.position(jardimsn);
        marker13.title("Ecoponto Jardim São Nicolau");
        marker13.snippet("R. Agreste de Itabaiana, 590 - Jardim Artur Alvim");
        mMap.addMarker(marker13);

        LatLng pqboturussu = new LatLng(-23.5039547, -46.4871549);
        MarkerOptions marker14 = new MarkerOptions();
        marker14.position(pqboturussu);
        marker14.title("Ecoponto Parque Boturussu");
        marker14.snippet("R. Nélio Batista Guimarães, 174 - Parque Boturussu");
        mMap.addMarker(marker14);

        LatLng jardimsp = new LatLng(-23.5653934, -46.4006764);
        MarkerOptions marker15 = new MarkerOptions();
        marker15.position(jardimsp);
        marker15.title("Ecoponto Jardim São Paulo");
        marker15.snippet("Rua Utaro Kanai, 374 - Conj. Hab. Juscelino Kubitscheck de Oliveira");
        mMap.addMarker(marker15);

        LatLng terezac = new LatLng(-23.569102, -46.6107001);
        MarkerOptions marker16 = new MarkerOptions();
        marker16.position(terezac);
        marker16.title("Ecoponto Tereza Cristina");
        marker16.snippet("Rua Teresa Cristina, 10 - Ipiranga");
        mMap.addMarker(marker16);

        LatLng santacruz = new LatLng(-23.5996933, -46.625364);
        MarkerOptions marker17 = new MarkerOptions();
        marker17.position(santacruz);
        marker17.title("Ecoponto Santa Cruz");
        marker17.snippet("R. Santa Cruz, 1452 - Vila Mariana");
        mMap.addMarker(marker17);

        LatLng vilamerces = new LatLng(-23.6237753, -46.6076169);
        MarkerOptions marker18 = new MarkerOptions();
        marker18.position(vilamerces);
        marker18.title("Ecoponto Vila das Mercês");
        marker18.snippet("R. Italva, 86 - Vila Moraes");
        mMap.addMarker(marker18);

        LatLng corinthians = new LatLng(-23.5474193, -46.4390272);
        MarkerOptions marker19 = new MarkerOptions();
        marker19.position(corinthians);
        marker19.title("Ecoponto Corinthians");
        marker19.snippet("R. Ana Perena, 91-101 - Jardim Bonifacio");
        mMap.addMarker(marker19);

        LatLng pqguarani = new LatLng(-23.5207932, -46.4657629);
        MarkerOptions marker20 = new MarkerOptions();
        marker20.position(pqguarani);
        marker20.title("Ecoponto Parque Guarani");
        marker20.snippet("R. Manuel Alves da Rocha, 584 - Parque Guarani");
        mMap.addMarker(marker20);

        LatLng osvaldocordeiro = new LatLng(-23.5222179, -46.4891273);
        MarkerOptions marker21 = new MarkerOptions();
        marker21.position(osvaldocordeiro);
        marker21.title("Ecoponto Osvaldo Valle de Cordeiro");
        marker21.snippet("Av. Oswaldo Valle Cordeiro, S/N - Cidade Líder");
        mMap.addMarker(marker21);

        LatLng cidadelider = new LatLng(-23.5630775, -46.4976842);
        MarkerOptions marker22 = new MarkerOptions();
        marker22.position(cidadelider);
        marker22.title("Ecoponto Cidade Líder");
        marker22.snippet("R. Charles Manguin, 2-20 - Jardim Marilia");
        mMap.addMarker(marker22);

        LatLng moreira = new LatLng(-23.4975058, -46.3730389);
        MarkerOptions marker23 = new MarkerOptions();
        marker23.position(moreira);
        marker23.title("Ecoponto Moreira");
        marker23.snippet("Rua João Batista de Godoy, 1164 - Jardim Meliunas");
        mMap.addMarker(marker23);

        LatLng pesqueiro = new LatLng(-23.5011156, -46.391628);
        MarkerOptions marker24 = new MarkerOptions();
        marker24.position(pesqueiro);
        marker24.title("Ecoponto Pesqueiro");
        marker24.snippet("R. Caiuás - Jardim Camargo Novo");
        mMap.addMarker(marker24);

        LatLng flamingo = new LatLng(-23.5141581, -46.4236851);
        MarkerOptions marker25 = new MarkerOptions();
        marker25.position(flamingo);
        marker25.title("Ecoponto Flamingo");
        marker25.snippet("R. Alexandre Dias Nogueira, 353 - Vila Nova Curuca");
        mMap.addMarker(marker25);

        LatLng imigrantes = new LatLng(-23.5143608, -46.4212409);
        MarkerOptions marker26 = new MarkerOptions();
        marker26.position(imigrantes);
        marker26.title("Ecoponto Imigrantes");
        marker26.snippet("Rua Opixé - Vila Guarani");
        mMap.addMarker(marker26);

        LatLng jabaquara = new LatLng(-23.6532661, -46.6516438);
        MarkerOptions marker27 = new MarkerOptions();
        marker27.position(jabaquara);
        marker27.title("Ecoponto Jabaquara");
        marker27.snippet("Rua Jupatis, 140 - Vila Mira");
        mMap.addMarker(marker27);

        LatLng alceumaynard = new LatLng(-23.6355286, -46.7152404);
        MarkerOptions marker28 = new MarkerOptions();
        marker28.position(alceumaynard);
        marker28.title("Ecoponto Alceu Maynard de Araújo");
        marker28.snippet("Av. Professor Alceu Maynard Araújo, 330 - Vila Cruzeiro");
        mMap.addMarker(marker28);

        LatLng vicenterao = new LatLng(-23.6283928, -46.6877613);
        MarkerOptions marker29 = new MarkerOptions();
        marker29.position(vicenterao);
        marker29.title("Ecoponto Vicente Rao");
        marker29.snippet("Av. Professor Vicente Rao, 308 - Santo Amaro");
        mMap.addMarker(marker29);

        LatLng cipoaba = new LatLng(-23.6293781, -46.4643467);
        MarkerOptions marker30 = new MarkerOptions();
        marker30.position(cipoaba);
        marker30.title("Ecoponto Cipoaba");
        marker30.snippet("R. Padre Luís de Siqueira - Jardim Rodolfo Pirani");
        mMap.addMarker(marker30);

        LatLng montalvania = new LatLng(-23.5792563, -46.4975604);
        MarkerOptions marker31 = new MarkerOptions();
        marker31.position(montalvania);
        marker31.title("Ecoponto Montalvania");
        marker31.snippet("R. Montalvânia, 195 - Jardim Sao Cristovao");
        mMap.addMarker(marker31);

        LatLng imperador = new LatLng(-23.5139854, -46.4588374);
        MarkerOptions marker32 = new MarkerOptions();
        marker32.position(imperador);
        marker32.title("Ecoponto Imperador");
        marker32.snippet("Av. Ribeirão Jacu, 201 - Jardim Santana");
        mMap.addMarker(marker32);

        LatLng carlitomaia = new LatLng(-23.4900279, -46.3957814);
        MarkerOptions marker33 = new MarkerOptions();
        marker33.position(carlitomaia);
        marker33.title("Ecoponto Carlito Maia");
        marker3.snippet("R. Domingos Fernandes Nobre, 109 - Itaím");
        mMap.addMarker(marker33);

        LatLng pedronunes = new LatLng(-23.5064568, -46.4644217);
        MarkerOptions marker34 = new MarkerOptions();
        marker34.position(pedronunes);
        marker34.title("Ecoponto Pedro Nunes");
        marker34.snippet("R. da Polka, 100 - Jardim Pedro José Nunes");
        mMap.addMarker(marker34);

        LatLng itaqueruna = new LatLng(-23.5101388, -46.4349765);
        MarkerOptions marker35 = new MarkerOptions();
        marker35.position(itaqueruna);
        marker35.title("Ecoponto Itaquerunaa");
        marker35.snippet(" Rua Domitilia d'Abril - Cidade Nova São Miguel");
        mMap.addMarker(marker35);

        LatLng mirandopolis = new LatLng(-23.6117038, -46.6468361);
        MarkerOptions marker36 = new MarkerOptions();
        marker36.position(mirandopolis);
        marker36.title("Ecoponto Mirandópolis");
        marker36.snippet("Av. Senador Casemiro da Rocha, 1220 - Mirandópolis");
        mMap.addMarker(marker36);

        LatLng vilamariana = new LatLng(-23.5931297, -46.6373066);
        MarkerOptions marker37 = new MarkerOptions();
        marker37.position(vilamariana);
        marker37.title("Ecoponto Vila Mariana");
        marker37.snippet("209, Rua Afonso Celso, 147 - Vila Mariana");
        mMap.addMarker(marker37);

        LatLng saioa = new LatLng(-23.594445, -46.6248366);
        MarkerOptions marker38 = new MarkerOptions();
        marker38.position(saioa);
        marker38.title("Ecoponto Saioá");
        marker38.snippet("Rua Professor Oswaldo Lacerda Gomes Cardim");
        mMap.addMarker(marker38);

        LatLng anhaiamello = new LatLng(-23.5826243, -46.573372);
        MarkerOptions marker39 = new MarkerOptions();
        marker39.position(anhaiamello);
        marker39.title("Ecoponto Anhaia Mello");
        marker39.snippet("Av. Professor Luiz Ignácio Anhaia Mello, 2233 - Vila Prudente");
        mMap.addMarker(marker39);

        LatLng saolucas = new LatLng(-23.5991863, -46.5367422);
        MarkerOptions marker40 = new MarkerOptions();
        marker40.position(saolucas);
        marker40.title("Ecoponto São Lucas");
        marker40.snippet("R. Florêncio Sanches, 307 - Vila Prudente");
        mMap.addMarker(marker40);

        LatLng vilacardoso = new LatLng(-23.623301, -46.5112706);
        MarkerOptions marker41 = new MarkerOptions();
        marker41.position(vilacardoso);
        marker41.title("Ecoponto Vila Cardoso Franco");
        marker41.snippet("Rua dos Vorás, 25 - Vila Cardoso Franco, Santo André ");
        mMap.addMarker(marker41);

        LatLng sapopemba = new LatLng(-23.6054956, -46.4991432);
        MarkerOptions marker42 = new MarkerOptions();
        marker42.position(sapopemba);
        marker42.title("Ecoponto Sapopemba");
        marker42.snippet("R. Francesco Usper, 550 - Conj. Promorar Sapopemba");
        mMap.addMarker(marker42);

        LatLng piraporinha = new LatLng(-23.669839, -46.7387184);
        MarkerOptions marker43 = new MarkerOptions();
        marker43.position(piraporinha);
        marker43.title("Ecoponto Piraporinha");
        marker43.snippet("R. João de Abreu, 326 - Jardim das Flores");
        mMap.addMarker(marker43);

        LatLng jardimaria = new LatLng(-23.5956082, -46.7490216);
        MarkerOptions marker44 = new MarkerOptions();
        marker44.position(jardimaria);
        marker44.title("Ecoponto Jardim Maria do Carmo");
        marker44.snippet("R. Caminho do Engenho, 800 - Ferreira");
        mMap.addMarker(marker44);

        LatLng politecnica = new LatLng(-23.5759364, -46.7672821);
        MarkerOptions marker45 = new MarkerOptions();
        marker45.position(politecnica);
        marker45.title("Ecoponto Politécnica");
        marker45.snippet("Rua Paulino Baptista Conti - Vila Antonio");
        mMap.addMarker(marker45);

        LatLng parqueperuche = new LatLng(-23.4917169, -46.6582157);
        MarkerOptions marker46 = new MarkerOptions();
        marker46.position(parqueperuche);
        marker46.title("Ecoponto Parque Peruche");
        marker46.snippet("Av. Eng. Caetano Álvares, 3142 - Parque Peruche");
        mMap.addMarker(marker46);

        LatLng vilanova = new LatLng(-23.4722745, -46.6720113);
        MarkerOptions marker47 = new MarkerOptions();
        marker47.position(vilanova);
        marker47.title("Ecoponto Vila Nova Cachoeirinha");
        marker47.snippet("Rua Felix Alves Pereira, 113 - Vila Nova Cachoeirinha");
        mMap.addMarker(marker47);

        LatLng vilasanta = new LatLng(-23.4940117, -46.6737749);
        MarkerOptions marker48 = new MarkerOptions();
        marker48.position(vilasanta);
        marker48.title("Ecoponto Vila Santa Maria");
        marker48.snippet("R. André Bolsena - Vila Santista");
        mMap.addMarker(marker48);

        LatLng bandeirantes = new LatLng(-23.4863367, -46.6972522);
        MarkerOptions marker49 = new MarkerOptions();
        marker49.position(bandeirantes);
        marker49.title("Ecoponto Bandeirantes");
        marker49.snippet("R. Itaiquara, 237 - Parque Monteiro Soares");
        mMap.addMarker(marker49);

        LatLng freguesia = new LatLng(-23.5057484, -46.7067406);
        MarkerOptions marker50 = new MarkerOptions();
        marker50.position(freguesia);
        marker50.title("Ecoponto Freguesia do Ó");
        marker50.snippet("R. Souza Filho, 690 - Vila Arcadia");
        mMap.addMarker(marker50);

        LatLng vilarica = new LatLng(-23.4698856, -46.6770566);
        MarkerOptions marker51 = new MarkerOptions();
        marker51.position(vilarica);
        marker51.title("Ecoponto Vila Rica");
        marker51.snippet("R. Jorge Mamede da Silva, 200 - Vila Rica");
        mMap.addMarker(marker51);

        LatLng antartica = new LatLng(-23.524423, -46.6728294);
        MarkerOptions marker52 = new MarkerOptions();
        marker52.position(antartica);
        marker52.title("Ecoponto Viad. Antártica");
        marker52.snippet("Rua Robert Bosch, 242 - Parque Industrial Tomas Edson, São Paulo - SP, 05003-020");
        mMap.addMarker(marker52);

        LatLng bresser = new LatLng(-23.5434689, -46.6085985);
        MarkerOptions marker53 = new MarkerOptions();
        marker53.position(bresser);
        marker53.title("Ecoponto Bresser");
        marker53.snippet("Praça Giuseppe Cesari, 54 - Brás");
        mMap.addMarker(marker53);

        LatLng tatuape = new LatLng(-23.5299194, -46.5852123);
        MarkerOptions marker54 = new MarkerOptions();
        marker54.position(tatuape);
        marker54.title("Ecoponto Tatuapé");
        marker54.snippet("Av. Salim Farah Maluf, 179 - Tatuapé");
        mMap.addMarker(marker54);

        LatLng bras = new LatLng(-23.5544721, -46.6129947);
        MarkerOptions marker55 = new MarkerOptions();
        marker55.position(bras);
        marker55.title("Ecoponto Brás");
        marker55.snippet("R. Palmorino Mônaco - Mooca");
        mMap.addMarker(marker55);

        LatLng mooca = new LatLng(-23.5477252, -46.6048944);
        MarkerOptions marker56 = new MarkerOptions();
        marker56.position(mooca);
        marker56.title("Ecoponto Moóca");
        marker56.snippet("R. Pires do Rio, s/n - Belenzinho");
        mMap.addMarker(marker56);

        LatLng belem = new LatLng(-23.5432919, -46.5961263);
        MarkerOptions marker57 = new MarkerOptions();
        marker57.position(belem);
        marker57.title("Ecoponto Belém");
        marker57.snippet("R. Artur Mota - Belenzinho");
        mMap.addMarker(marker57);

        LatLng vilaluisa = new LatLng(-23.5312229, -46.5546378);
        MarkerOptions marker58 = new MarkerOptions();
        marker58.position(vilaluisa);
        marker58.title("Ecoponto Vila Luisa");
        marker58.snippet("R. Manoel Graça - Guaiauna");
        mMap.addMarker(marker58);

        LatLng penha = new LatLng(-23.5312947, -46.5276392);
        MarkerOptions marker59 = new MarkerOptions();
        marker59.position(penha);
        marker59.title("Ecoponto Penha I");
        marker59.snippet("R. Dr. Heládio, 104 - Penha de Franca");
        mMap.addMarker(marker59);

        LatLng tiquatira = new LatLng(-23.5135476, -46.5458952);
        MarkerOptions marker60 = new MarkerOptions();
        marker60.position(tiquatira);
        marker60.title("Ecoponto Tiquatira");
        marker60.snippet("Av. Governador Carvalho Pinto, s/n - Jardim Mariana");
        mMap.addMarker(marker60);

        LatLng gamelinha = new LatLng(-23.5508283, -46.4970938);
        MarkerOptions marker61 = new MarkerOptions();
        marker61.position(gamelinha);
        marker61.title("Ecoponto Gamelinha");
        marker61.snippet("R. Morfeu, 25 - Vila Nhocune");
        mMap.addMarker(marker61);

        LatLng vilamatilde = new LatLng(-23.5392419, -46.5073639);
        MarkerOptions marker62 = new MarkerOptions();
        marker62.position(vilamatilde);
        marker62.title("Ecoponto Vila Matilde");
        marker62.snippet("R. Mateus de Siqueira - Cidade Patriarca");
        mMap.addMarker(marker62);

        LatLng recanto = new LatLng(-23.4091525, -46.7528477);
        MarkerOptions marker63 = new MarkerOptions();
        marker63.position(recanto);
        marker63.title("Ecoponto Recanto dos Humildes");
        marker63.snippet("R. Salles Gomes, 415 - Perus");
        mMap.addMarker(marker63);

        LatLng jardimsanta = new LatLng(-23.4318389, -46.7941095);
        MarkerOptions marker64 = new MarkerOptions();
        marker64.position(jardimsanta);
        marker64.title("Ecoponto Jardim Santa Fé");
        marker64.snippet(" R. Salvador Albano - Jardim Santa Fé");
        mMap.addMarker(marker64);

        LatLng pinheiros = new LatLng(-23.5974167, -46.6936407);
        MarkerOptions marker65 = new MarkerOptions();
        marker65.position(pinheiros);
        marker65.title("Ecoponto Pinheiros");
        marker65.snippet("Praça do Cancioneiro, 15 - Cidade Monções");
        mMap.addMarker(marker65);

        LatLng vilamadalena = new LatLng(-23.5584042, -46.6896777);
        MarkerOptions marker66 = new MarkerOptions();
        marker66.position(vilamadalena);
        marker66.title("Ecoponto Vila Madalena");
        marker66.snippet("R. Girassol, 15 - Vila Madalena");
        mMap.addMarker(marker66);

        LatLng altopinheiros = new LatLng(-23.557077, -46.7127192);
        MarkerOptions marker67 = new MarkerOptions();
        marker67.position(altopinheiros);
        marker67.title("Ecoponto Alto de Pinheiros");
        marker67.snippet("Praça Arcipreste Anselmo de Oliveira - Alto de Pinheiros");
        mMap.addMarker(marker67);

        LatLng conegojose = new LatLng(-23.4921041, -46.7242125);
        MarkerOptions marker68 = new MarkerOptions();
        marker68.position(conegojose);
        marker68.title("Ecoponto Cônego José Salomon");
        marker68.snippet("Av. Cônego José Salomon, 861 - Jardim Felicidade (Zona Norte)");
        mMap.addMarker(marker68);

        LatLng alexios = new LatLng(-23.4530216, -46.7518741);
        MarkerOptions marker69 = new MarkerOptions();
        marker69.position(alexios);
        marker69.title("Ecoponto Alexios Jafet");
        marker69.snippet("Av. Alexios Jafet - Vila Chica Luisa");
        mMap.addMarker(marker69);

        LatLng liberdade = new LatLng(-23.556555, -46.6392484);
        MarkerOptions marker70 = new MarkerOptions();
        marker70.position(liberdade);
        marker70.title("Ecoponto Liberdade");
        marker70.snippet("Rua Jaceguai, 67 - Liberdade");
        mMap.addMarker(marker70);

        LatLng barrafunda = new LatLng(-23.5270188, -46.6506864);
        MarkerOptions marker71 = new MarkerOptions();
        marker71.position(barrafunda);
        marker71.title("Ecoponto Barra Funda");
        marker71.snippet("Rua Solon - Barra Funda");
        mMap.addMarker(marker71);

        LatLng vilaguilherme = new LatLng(-23.5171655, -46.6025932);
        MarkerOptions marker72 = new MarkerOptions();
        marker72.position(vilaguilherme);
        marker72.title("Ecoponto Vila Guilherme");
        marker72.snippet("Rua José Bernardo Pinto, 1480 - Vila Guilherme");
        mMap.addMarker(marker60);

        LatLng vilasabrina = new LatLng(-23.4863108, -46.5677485);
        MarkerOptions marker73 = new MarkerOptions();
        marker73.position(vilasabrina);
        marker73.title("Ecoponto Vila Sabrina ");
        marker73.snippet("Av. do Poe., 931 - Jardim Julieta");
        mMap.addMarker(marker73);

        LatLng vilamaria = new LatLng(-23.5195732, -46.5830559);
        MarkerOptions marker74 = new MarkerOptions();
        marker74.position(vilamaria);
        marker74.title("Ecoponto Vila Maria");
        marker74.snippet("R. Curuçá, 1700 - Vila Maria");
        mMap.addMarker(marker74);

        LatLng tucuruvi = new LatLng(-23.4672954, -46.6121444);
        MarkerOptions marker75 = new MarkerOptions();
        marker75.position(tucuruvi);
        marker75.title("Ecoponto Tucuruvi");
        marker75.snippet(" R. Eduardo Vicente Nasser, 519 - Jardim Leonor Mendes de Barros");
        mMap.addMarker(marker75);

    }
    private boolean checkPermission () {
        Log.d(TAG, "checkPermission()");
        // Ask for permission if it wasn't granted yet
        return (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED);
    }

    private void askPermission () {
        Log.d(TAG, "askPermission()");
        ActivityCompat.requestPermissions(
                getActivity(),
                new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                REQ_PERMISSION
        );
    }

    @Override
    public void onRequestPermissionsResult ( int requestCode, @NonNull String[] permissions,
                                             @NonNull int[] grantResults){
        Log.d(TAG, "onRequestPermissionsResult()");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQ_PERMISSION: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission granted
                    if (checkPermission())
                        mMap.setMyLocationEnabled(true);

                } else {
                    // Permission denied

                }
                break;
            }

        }
    }
}


