package edu.gatech.cs2340.spacetraderredux.Model;

public enum SolarSystemName {
    ACAMAR,
    ADAHN,
    ALDEA,
    ANDEVIAN,
    ANTEDI,
    BALOSNEE,
    BARATAS,
    BRAX,
    BRETEL,
    CALONDIA,
    CAMPOR,
    CAPELLE,
    CARZON,
    CASTOR,
    CESTUS,
    CHERON,
    COURTENEY,
    DALED,
    DAMAST,
    DAVLOS,
    DENEB,
    DENEVA,
    DEVIDIA,
    DRAYLON,
    DREMA,
    ENDOR,
    ESMEE,
    EXO,
    FERRIS,
    FESTEN,
    FOURMI,
    FROLIX,
    GEMULON,
    GUINIFER,
    HADES,
    HAMLET,
    HELENA,
    HULST,
    IODINE,
    IRALIUS,
    JANUS,
    JAPORI,
    JARADA,
    JASON,
    KAYLON,
    KHEFKA,
    KIRA,
    KLAATU,
    KLAESTRON,
    KORMA,
    KRAVAT,
    KRIOS,
    LAERTES,
    LARGO,
    LAVE,
    LIGON,
    LOWRY,
    MAGRAT,
    MALCORIA,
    MELINA,
    MENTAR,
    MERIK,
    MINTAKA,
    MONTOR,
    MORDAN,
    MYRTHE,
    NELVANA,
    NIX,
    NYLE,
    ODET,
    OG,
    OMEGA,
    OMPHALOS,
    ORIAS,
    OTHELLO,
    PARADE,
    PENTHARA,
    PICARD,
    POLLUX,
    QUATOR,
    RAKHAR,
    RAN,
    REGULAS,
    RELVA,
    RHYMUS,
    ROCHANI,
    RUBICUM,
    RUTIA,
    SARPEIDON,
    SEFALLA,
    SELTRICE,
    SIGMA,
    SOL,
    SOMARI,
    STAKORON,
    STYRIS,
    TALANI,
    TAMUS,
    TANTALOS,
    TANUGA,
    TARCHANNEN,
    TEROSA,
    THERA,
    TITAN,
    TORIN,
    TRIACUS,
    TURKANA,
    TYRUS,
    UMBERLEE,
    UTOPIA,
    VADERA,
    VAGRA,
    VANDOR,
    VENTAX,
    XENON,
    XERXES,
    YEW,
    YOJIMBO,
    ZALKON,
    ZUUL;

    public final String displayName;
    SolarSystemName() {
        displayName = name().substring(0,1) + name().toLowerCase().substring(1);
    }
}
