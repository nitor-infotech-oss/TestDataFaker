package com.qa;

import java.util.Random;
import net.datafaker.*;

public class FakerClass {
    // #region Get Voucher
    // Method to generate a voucher number
    public String getVoucherNumber() {
        // Use Random characters
        String first = new Faker().moneyHeist().character().toUpperCase();
        Integer middle = new Random().nextInt(89) + 10;
        String last = new Faker().harryPotter().character().toUpperCase();

        String toReturn = first.substring(0, 3) + middle.toString() + last.substring(0, 3);
        return toReturn;
    }
    // #endregion

    // #region Get First Name
    public String getFirstName() {
        
        return new Faker().name().firstName();

    }
    // #endregion

    // #region Get Last Name
    public String getLastName() {
        return new Faker().name().lastName();
    }
    // #endregion

    // #region Get Phone Number
    public String getPhoneNumber() {
        return new Faker().phoneNumber().phoneNumber();
    }
    // #endregion

    // #region Email ID
    public String getFakeEmailID() {
        String firstName = getFirstName();
        String lastName = getLastName();
        String companyName = new Faker().company().name().replace(",", "");
        
        if (companyName.contains("-"))
            companyName = companyName.replace("-", "");

        String companyDomainName = companyName.substring(0, companyName.indexOf(""));

        return firstName + "." + lastName + "@" + companyDomainName + ".com";
    }
    // #endregion

    // #region Get Airport Code
    public String getAirportCode() {
        return airportCodes[new Random().nextInt(airportCodes.length)];
    }
    // #endregion

    // #region Get Flight Number
    public String getFlightNumber() {
        int numberOfAirportCodes = listFlightcodes.length;
        Random r = new Random();
        int randomNumber = r.nextInt(numberOfAirportCodes);
        int numbertoAppend = r.nextInt(899) + 100;
        return listFlightcodes[randomNumber] + numbertoAppend;
    }
    // #endregion

    //#region Fake Birth Dates
    public String getFakeBirthdayMinor()
    {
        return new Faker().date().birthday(0, 18, "dd MMM yyyy");
    }
    public String getFakeBirthdayAdult()
    {
        return new Faker().date().birthday(18, 60, "dd MMM yyyy");
    }
    public String getFakeBirthdaySeniorCitizen(){
        return new Faker().date().birthday(60, 100, "dd MMM yyyy");
    }
    //#endregion

    //#region Constants
    
    //List of all airport codes
    protected String[] airportCodes = { "AAR", " ABD", " AEH", " ABZ", " ABR", " ABJ", " ABI", " AUH", " ABV",
    " AUE", " ABS", " ACA", " ACC", " ADA", " ADD", " ADL", " ADE", " ADF", " AER", " AJY",
    " AGA", " SUM", " AGZ", " BQN", " AGU", " AMD", " AYU", " AJA", " AXT", " CAK", " AKT",
    " AAN", " AAC", " ALH", " ABY", " ALB", " LBI", " AAL", " ABQ", " ABX", " ACI", " ALP",
    " AES", " ALJ", " HBH", " ALY", " ESF", " FJR", " AHO", " ALG", " AHU", " ALC", " ASP",
    " ADY", " ABE", " ALA", " LEI", " ALF", " AAT", " ACH", " AOO", " AXS", " ASJ", " AMA",
    " AZB", " AMM", " ADJ", " ATQ", " AMS", " QNB", " ANC", " AOI", " ALV", " AXA", " AJN",
    " ANK", " ESB", " AAE", " ARB", " NCY", " ANB", " AYT", " TNR", " ANU", " ANR", " AOJ",
    " APW", " ATW", " AQJ", " AJU", " ARH", " ARK", " GPA", " RLT", " ACE", " AUA", " AVL",
    " ASB", " ASM", " ASE", " ATZ", " TSE", " ASU", " ASW", " ATH", " HEW", " AHN", " ATO",
    " ATL", " ACY", " YAT", " AKL", " AGB", " AGS", " AUG", " AUR", " AUS", " AYW", " AYQ",
    " AYR", " BJZ", " BGW", " IXB", " NAS", " BHV", " BAH", " BFL", " BAK", " BNK", " BWI",
    " ABM", " BKO", " BBY", " BWN", " BDO", " BLR", " BGU", " DMK", " BKK", " BGR", " BGF",
    " BJL", " BNP", " BCN", " BLA", " BDU", " BRI", "  BZL", " BDQ", " BRR", " BAQ", " BSL",
    " EAP", " BSR", " PTP", " SKB", " BIA", " BTR", " BYU", " BPT", " BKW", " EIS", " PEK",
    " NAY", " BEW", " BEY", " BEL", " BHD", " BFS", " IXG", " BEG", " BZE", " BLI", " CNF",
    " BJI", " BEB", " BEN", " BUG", " BEH", " BBT", " BGY", " BGO", " EGC", " BER", " SXF",
    " TXL", " THF", " BDA", " BRN", " ZDJ", " BET", " BHO", " BBI", " BIQ", " BIO", " BIL",
    " BLL", " BTU", " IRO", " BHX", " BHM", " FRU", " BIS", " BXO", " BLK", " BLT", " BLZ",
    " BHE", " BFN", " BMI", " BMG", " BLF", " BVB", " BOY", " BOO", " BJV", " BOG", " BOI",
    " BLQ", " BOM", " BON", " YVB", " BOB", " BOD", " BXS", " BOS", " BYK", " BOJ", " BOH",
    " ZBO", " BZN", " BFD", " BRD", " BMP", " BSB", " BTS", " BZV", " BRE", " VBS", " BES",
    " BIV", " BDR", " BGI", " BDS", " BNE", " BRS", " BNN", " BHQ", " BKX", " BME", " BQK",
    " BRU", " BGA", " BUH", " OTP", " BUD", " BUE", " EZE", " AEP", " BFO", " BUF", " BJM",
    " BUQ", " BHC", " BDB", " BUR", " BRL", " BTV", " BWT", " BTM", " CAB", " CAG", " CNS",
    " CAI", " CJC", " CCU", " YYC", " CLO", " CCJ", " CLY", " YCB", " CBG", " CAL", " CGR",
    " CBR", " CUN", " CEQ", " CIW", " CPT", " CCS", " CWL", " CLD", " CVQ", " CRF", " CSN",
    " CAS", " CMN", " LRM", " CSI", " CPR", " CST", " CTG", " SLU", " CTA", " CAY", " CBU",
    " CEB", " CDC", " CID", " CED", " CES", " KHV", " CMF", " CMI", " IXC", " CGQ", " CHQ",
    " CHG", " CHS", " CRW", " CLT", " CHO", " CXT", " CHA", " CTU", " MAA", " CYS", " CNX",
    " QCB", " MDW", " ORD", " CHI", " CZA", " CIC", " CUU", " JKH", " CIP", " KIV", " HTA",
    " CTS", " CJL", " CGP", " CKG", " CHC", " CCZ", " YYQ", " CFG", " CVG", " CME", " CGU",
    " CJS", " CEN", " CVM", " CKB", " CMQ", " CFE", " BKL", " CLE", " CBB", " COK", " COD",
    " KCC", " CFS", " CJB", " CLQ", " CLL", " KCE", " CGN", " CMB", " COS", " CAE", " CSG",
    " CMH", " CKY", " CCR", " CON", " CZL", " CND", " CPD", " CTN", " OOM", " CPH", " COR",
    " ODB", " CDV", " CFU", " ORK", " CRP", " COO", " CVT", " CZM", " CGA", " CEC", " CGB",
    " CUL", " CUR", " CWB", " CYU", " DKR", " DLM", " DBY", " DLC", " DAL", " DFW", " DJO",
    " DAM", " DMM", " DAN", " DAR", " DRW", " DDI", " DAY", " DAB", " DEC", " YDF", " DEL",
    " HAG", " DNZ", " DPS", " DEN", " DSK", " DRB", " LDY", " DSM", " DET", " DTW", " DTT",
    " DVL", " DPO", " DHA", " DAC", " DIL", " DLG", " DNR", " DLP", " DJE", " JIB", " DOD",
    " DOH", " DSA", " CFN", " DTM", " DHN", " DLA", " DRS", " DXB", " DBO", " DUB", " DUJ",
    " DBV", " DBQ", " DUS", " DLH", " DND", " DUD", " DKI", " DRO", " DUR", " DYU", " DUT",
    " DYA", " DZA", " ELS", " IPC", " EAU", " EDI", " YEA", " YEG", " YXD", " EGS", " EIN",
    " AZS", " EBA", " ETH", " VDA", " EKI", " EKO", " ELL", " EMY", " ELM", " ELP", " ELY",
    " EDR", " EMD", " ENF", " EBB", " ERF", " ERI", " EVN", " ERC", " ERZ", " EBJ", " ESC",
    " EPR", " EUG", " ACV", " EVV", " EVE", " EXT", " FAI", " FIE", " LYP", " FAR", " FMN",
    " FAO", " FAE", " FYV", " FAY", " FEZ", " FSC", " FLG", " YFO", " FNT", " FLR", " FLO",
    " FLN", " FRO", " YFA", " FOR", " FDF", " FOD", " FHU", " FLL", " YMM", " FMY", " RSW",
    " FRI", " YSM", " FSM", " YXJ", " VPS", " FWA", " DFW", " FOU", " FRW", " FRA", " HHN",
    " FKL", " YFC", " FPO", " FNA", " FRJ", " FAT", " FDH", " FUE", " FJR", " FUK", " FKS",
    " FNC", " FUT", " GBE", " GAD", " GNV", " GWY", " YQX", " GOU", " GZA", " GZT", " GDN",
    " GEX", " GVA", " GOA", " GRJ", " GEO", " GET", " GRO", " GNE", " GIB", " GCC", " GIL",
    " YGX", " GLT", " PIK", " GLA", " GGW", " GDV", " GOI", " GYN", " OOL", " GOO", " YYR",
    " GOZ", " GOT", " GOV", " GHB", " GRX", " FPO", " GCN", " GCM", " GFK", " GJT", " GRR",
    " GPZ", " GRZ", " GTF", " GKL", " GRB", " LWB", " GSO", " GLH", " PGV", " GSP", " GND",
    " GNB", " GFF", " GRQ", " GTE", " GON", " GDL", " GSI", " GUM", " CAN", " GRU", " GUA",
    " GYE", " GCI", " GTI", " GPT", " KWL", " ULU", " GUC", " GAU", " GWD", " GWE", " GYP",
    " HAC", " GUM", " HFA", " HNS", " HKD", " YHZ", " YUX", " HAM", " HLT", " YHM", " HLZ",
    " HTI", " HFT", " CMX", " HGH", " HAJ", " HAN", " HRE", " HRB", " HRL", " YHR", " HAR",
    " MDT", " BDL", " HDY", " HAU", " HAV", " HVR", " HIS", " HLN", " JHE", " HEL", " HER",
    " HMO", " HVB", " HIB", " HKY", " ITO", " HHH", " HNK", " HIJ", " SGN", " HBA", " HOQ",
    " HOG", " HMH", " HOM", " HKG", " ZJK", " HIR", " HNL", " HNH", " HOR", " HOU", " IAH",
    " HUH", " HUX", " HUI", " HUY", " HTS", " HSV", " HRG", " HON", " HWN", " HYA", " HYG",
    " HYD", " HDD", " IBZ", " IDA", " IGR", " ILP", " IOU", " ILI", " IPL", " IVC", " ICN",
    " IND", " IGH", " IFL", " INN", " INL", " YEV", " IVC", " INV", " IYK", " YFB", " IQT",
    " IKT", " ISG", " ISB", " ILY", " IOM", " IST", " SAW", " ITH", " IVL", " ZIH", " IZM",
    " ADB", " JAC", " JXN", " MJQ", " JAN", " HKS", " MKL", " JAC", " LRF", " NZC", " NIP",
    " JAX", " CRG", " IJX", " OAJ", " JKV", " JAK", " JAG", " JCM", " JAQ", " JAF", " JGB",
    " JAI", " JSA", " HLP", " JKT", " CGK", " JAA", " JLR", " JAL", " JLS", " UIT", " JMB",
    " DJB", " JAM", " JMS", " JHW", " IXJ", " JGA", " IXW", " JKR", " JAD", " JVL", " JNA",
    " JQE", " JTI", " JAU", " DJJ", " JED", " JEF", " JEE", " XRY", " JER", " JRS", " JSR",
    " PYB", " JGS", " JMU", " JGN", " GJL", " JIJ", " JIL", " JIM", " TNA", " JDZ", " JHG",
    " JNG", " JIN", " JJN", " BCO", " JNZ", " JIP", " JIR", " JIU", " JIW", " JCB", " JPA",
    " JDH", " JKG", " JOE", " JNB", " BGM", " JON", " JST", " JHB", " JOI", " JOL", " JMO",
    " JBR", " JLN", " JRH", " JOS", " JSM", " AJF", " JJI", " JUB", " JUI", " JDF", " JUJ",
    " JCK", " JUL", " JUM", " JUN", " JNU", " JNI", " JUT", " JWA", " JYV", " KBL", " KOJ",
    " KCM", " OGG", " KAJ", " KLX", " AZO", " KGI", " KGD", " FCA", " KLR", " YKA", " MUE",
    " KAN", " KNU", " MCI", " KHH", " JHM", " KHI", " FKB", " KSD", " AOK", " KTA", " KYS",
    " KRB", " KRP", " ZKE", "  KSL", " KTR", " KTM", " MPA", " KHJ", " MKK", " KVA", " ASR",
    " KZN", " KMP", " YLW", " KEM", " ENA", " MSE", " KIR", " KTN", " EYW", " AHB", " UVL",
    " HRK", " KRT", " KDD", " KEL", " KBP", " IEV", " KGL", " JRO", " ILE", " KIM", " KNS",
    " AKN", " KGC", " KIN", " ISO", " SVD", " FIH", " CXI", " KKN", " KIK", " KOI", " KRN",
    " FKI", " KTT", " KIW", " KLU", " LMT", " KLW", " KLZ", " NOC", " TYS", " UKB", " KCZ",
    " CGN", " ADQ", " OHT", " KOK", " CCU", " KMQ", " KOA", " KYA", " HGO", " KGS", " BKI",
    " OTZ", " KWM", " KRK", " KRS", " KID", " KSU", " KUL", " SZB", " KUA", " KCH", " KMJ",
    " KNX", " KUO", " KUH", " YVP", " YGW", " KAO", " KWI", " UKY", " LEK", " WLB", " LBU",
    " XLB", " LCG", " LSE", " LAE", " LRH", " LAF", " LFT", " LOS", " YGL", " LHE", " LCH",
    " HII", " TVL", " LKL", " LBQ", " SUF", " LMP", " LNY", " LNS", " LEQ", " LGK", " LAI",
    " HLA", " LAN", " LPB", " LAP", " LPP", " LAR", " LRD", " LCA", " LPA", " LAS", " LBE",
    " LST", " PIB", " LVO", " LAW", " LZC", " YLR", " LEA", " LEB", " LBA", " LER", " LEJ",
    " LEY", " BJX", " LNO", " LWK", " LWS", " LWT", " LEX", " LBV", " LDK", " LGG", " LIF",
    " LIH", " LIL", " LLW", " LIM", " QLI", " LIG", " LNK", " LDC", " LNZ", " LIQ", " LIS",
    " LSY", " LIT", " LPL", " LZR", " LJU", " IRG", " LFW", " YXU", " LON", " LCY", " LGW",
    " LHR", " LTN", " STN", " LDY", " LGB", " LIJ", " ISP", " LRE", " GGG", " LYR", " LTO",
    " LRT", " LAX", " SJD", " LMM", " TFN", " LSZ", " LDE", " SDF", " LAD", " LBB", " LKO",
    " LUD", " MLA", " LUG", " LLA", " FBM", " LUN", " LUJ", " LUX", " LUM", " LXR", " LWO",
    " LYX", " LYH", " LYS", " LYO", " MST", " MCP", " MFM", " MCZ", " MKY", " MCN", " NOP",
    " MED", " MSN", " MAA", " MAD", " SEZ", " MAH", " MTL", " MJN", " MZG", " SSG", " AGP",
    " MLX", " MLE", " MYD", " MMA", " MMX", " MJC", " MGA", " MAO", " MAN", " MHT", " MDL",
    " MFO", " XMH", " MNL", " ZLO", " MTS", " MPM", " MDQ", " MAR", " MFQ", " KCM", " MTH",
    " MQM", " MEE", " MGH", " PMV", " MBX", " MHQ", " MVR", " MQT", " RAK", " RMF", " MUH",
    " MRS", " MHH", " MVY", " MRB", " MBH", " MSU", " MCW", " MVZ", " MMJ", " MYJ", " MTO",
    " MUB", " MAU", " MRU", " MAZ", " MZT", " MFE", " MES", " KNO", " MDE", " MFR", " MED",
    " MKR", " MEL", " MLB", " DOM", " MEM", " MDZ", " MDC", " MCE", " MID", " MEI", " MIM",
    " MEZ", " MTM", " MZM", " ETZ", " MXL", " MEX", " AZP", " MEX", " NLU", " MFU", " MIA",
    " MWD", " MMM", " MAF", " MDY", " MIK", " MIL", " LIN", " MXP", " BGY", " MQL", " MLS",
    " MFN", " MKE", " MTT", " MRV", " MSP", " MOT", " MSQ", " MYY", " QML", " MSO", " MHE",
    " MMY", " KMI", " MBM", " MFF", " MOB", " MOD", " MJD", " MGQ", " OKU", " MLI", " MBA",
    " MIR", " YQM", " MLU", " MLW", " ROB", " MBJ", " QGF", " MRY", " MTY", " NTR", " MVD",
    " MGM", " MPL", " YMQ", " YUL", " YMX", " MTJ", " MOZ", " MOV", " MRZ", " MLM", " MGW",
    " HNA", " HAH", " MYA", " MOW", " DME", " SVO", " VKO", " MWH", " MZY", " OMO", " OSM",
    " MJL", " MQQ", " GTN", " MGB", " MMG", " ISA", " MCL", " MUC", " FMO", " MLH", " MUX",
    " MJV", " MMK", " MSR", " MCT", " MSL", " MKG", " MFG", " MVB", " JMK", " MYR", " CRE",
    " MYQ", " MJT", " MZF", " NAN", " NGS", " NGO", " NAG", " NBO", " NAJ", " NST", " ENC",
    " YSR", " NNG", " NTE", " ACK", " NAP", " APF", " NAA", " NRA", " UAK", " BNA", " NAS",
    " NAT", " SUV", " WNS", " JNX", " NDJ", " NLA", " NSN", " NLP", " MQP", " NEV", " EWN",
    " HVN", " MSY", " NQY", " UVL", " JFK", " LGA", " EWR", " NYC", " SWF", " BEO", " NTL",
    " NCL", " NCS", " ZNE", " PHF", " NGE", " IAG", " NIM", " NCE", " NIC", " NLV", " KIJ",
    " FNI", " INI", " GOJ", " OME", " NSA", " NLK", " ORF", " YVQ", " NRK", " OTH", " ELH",
    " NWI", " EMA", " NDB", " NKC", " NOU", " QND", " OVB", " NUE", " NLD", " TBU", " OAK",
    " OAX", " ODE", " ODS", " ORB", " OHD", " OIT", " OKJ", " OKA", " OKC", " OLB", " OLP",
    " OMA", " OND", " ONT", " ORN", " OAG", " SNA", " OMD", " AUA", " KOI", " ORL", " MCO",
    " ORS", " OSA", " ITM", " KIX", " OSH", " OSI", " OSL", " FBU", " TRF", " YOW", " ODA",
    " OZZ", " OUH", " OUA", " OUD", " OUL", " OUK", " OVD", " OWB", " OXR", " UVE", " PAD",
    " PAH", " PGA", " PPG", " PKB", " PMO", " PMI", " PMW", " PMD", " PMR", " PSP", " PTY",
    " PFN", " PJG", " PNL", " PPT", " PFO", " PBO", " PBM", " PAR", " CDG", " LBG", " ORY",
    " PBH", " PSC", " PSI", " PAT", " PYX", " PUF", " PLN", " PEN", " PDT", " PNS", " PIA",
    " PEI", " PGF", " PER", " PEG", " PSR", " PEW", " PSG", " PHW", " PHL", " PNH", " PHX",
    " HKT", " PIR", " PZB", " PTG", " NTY", " PSA", " PIT", " PLB", " PBZ", " PIH", " TGD",
    " PNI", " PTP", " PNR", " PIS", " PSE", " PDL", " POR", " CLM", " PAP", " PUG", " PLZ",
    " POG", " PHC", " PHE", " PTJ", " PWM", " PDX", " PLO", " PQQ", " YPN", " POM", " OPO",
    " POA", " POS", " PSD", " PXO", " PVH", " VLI", " POU", " POZ", " PRG", " RAI", " PQI",
    " PRY", " PVK", " YXS", " YPR", " PRN", " PPP", " PVD", " SCC", " PBC", " PUB", " PXM",
    " PZO", " POP", " PVR", " XPK", " PUY", " PUW", " PNQ", " PUQ", " PUJ", " PUS", " FNJ",
    " YQB", " UEE", " ZQN", " UET", " TAO", " UIP", " UIN", " UIO", " RBA ", " RYK", " RFP",
    " YOP", " RAJ", " RDU", " IXR", " RGI", " RGN", " RAP", " RAR", " RKT", " RAZ", " RWP",
    " RDG", " REC", " RDD", " RDM", " REG", " YQR", " TFS", " RNS", " RNO", " YRB", " REU",
    " REK", " KEF", " RHI", " RHO", " RCB", " RIC", " RIX", " RJK", " RMI", " RBR", " GIG",
    " SDU", " RIO", " RUH", " RNE", " ROA", " RTB", " RST", " ROC", " RSD", " RKS", " RFD",
    " ROK", " RKD", " RWI", " RDZ", " RRG", " RNN", " ROM", " CIA", " FCO", " RNB", " ROS",
    " RVI", " ROV", " ROT", " RTM", " RVN", " NDU", " ROU", " SCN ", " SMF", " SDS", " MBS",
    " SDT", " SGN", " SBK", " RUN", " YSJ", " SPN", " SID", " SLL", " SLE", " SNS", "  SNC",
    " SAY", " SBY", " SKG", " SLA", " SLC", " SSA", " SZG", " KUF", " SKD", " SMI", " SZF",
    " ADZ", " SJT", " SAT", " BRC", " SAN", " SFO", " SJD", " SJO", " SJC", " SJU", " SBP",
    " SLP", " SPY", " SAP", " ZSA", " SAL", " EAS", " SAH", " YZP", " SNA", " SBA", " SPC",
    " SRZ", " SKV", " SMA", " SMX", " SDR", " STS", " SRB", " SRA", " RSA", " SDH", " SSL",
    " SRL", " SCU", " SCL", " SCQ", " SON", " SDQ", " SLZ", " SAO", " CGH", " GRU", " VCP",
    " TMS", " SPK", " OKD", " CTS", " SJJ", " SKX", " SRQ", " YXE", " ZSS", " SAV", " SVL",
    " TAB", " NSO", " SCF", " SEA", " SEB", " SJY", " PKW", " SDJ", " ICN", " SEL", " SVQ",
    " SFA", " ZTM", " SHA", " PVG", " SNN", " SHJ", " SSH", " SZD", " DSA", " SHD", " SHE",
    " SZX", " SHR", " SHV", " JHQ", " SBW", " SDY", " SLS", " SIP", " MPD", " SIN", " QPG",
    " XSP", " SIX", " SUX", " FSD", " SIS", " SIT", " VAS", " SEW", " SGY", " KDU", " JSI",
    " SKP", " SKS", " SZK", " SXL", " YYD", " SOT", " SGD", " SFJ", " SOF", " SOG", " SOU",
    " SBN", " XSI", " SOI", " SEN", " SPU", " GEG", " SBU", " SPI", " SGF", " SXR", " YIF",
    " STX", " EBU", " SGU", " YYT", " SKB", " STL", " UVF", " SLU", " SXM", " SFG", " LED",
    " FSP", " STT", " SVD", " STN", " SCE", " SVG", " HDN", " SZZ", " STO", " ARN", " BMA",
    " SCK", " SYY", " SXB", " KBY", " STR", " SUL", " SKZ", " LSI", " SUN", " SDL", " MCY",
    " SUB", " STV", " SUV", " SWP", " SYD", " ZYL", " SYR", " TUU ", " TIF", " TPE", " TAY",
    " TYN", " TAK", " TKA", " TLH", " QUF", " TLL", " TPA", " TMP", " TAM", " TMW", " TNG",
    " TRO", " TGV", " TAS", " TWU", " TBS", " TEU", " MME", " TGU", " THR", " TEQ", " TLV",
    " TEX", " TEM", " TCI", " TFS", " TFN", " TCA", " TER", " THE", " TMZ", " YXT", " HUF",
    " TXK", " TCU", " YQD", " SKG", " TVF", " JTR", " TRV", " TED", " YTH", " KTB", " YQT",
    " TIS", " TSN", " TIJ", " TOD", " TIA", " TRZ", " TIV", " TAB", " TKS", " TYO", " HND",
    " NRT", " TOL", " TPR", " TWB", " YTZ", " YYZ", " YTO", " TOV", " TOU", " TLS", " TSV",
    " TOY", " TZX", " TPS", " TVC", " TCB", " TTN", " TSF", " TRI", " TRS", " TIP", " TOS",
    " TRD", " TSB", " TUS", " TUP", " TUL", " TUN", " TUK", " TRN", " TKU", " TCL", " TGZ",
    " TWF", " TYR", " UAH", " UAP", " UBJ", " UBA", " UDI", " UBP", " UDR", " UDE", " UTH",
    " UFA", " UHE", " UGO", " UPG", " UCT", " UKI", " ULN", " UUD", " HLH", " ULB", " USN",
    " ULD", " UME", " YUD", " UTT", " UNK", " UNI", " UNT", " UPL", " JUV", " UTN", " UPP",
    " YBE", " UGC", " URM", " OMH", " UPN", " URB", " URG", " URC", " URZ", " USH", " UTP",
    " UCA", " UII", " UMD", " UDJ", " VAA ", " VXO", " EGE", " YVO", " VDZ", " VLD", " VLC",
    " VLN", " VLL", " VAP", " VDE", " VAN", " YVR", " VRA", " VNS", " VRK", " VAR", " VST",
    " VLU", " VCE", " VER", " VEL", " VRB", " VBS", " VRN", " YYJ", " VFA", " VID", " VTE",
    " VGO", " VSA", " VNO", " VIJ", " VIS", " VBY", " VIT", " VIX", " VYD", " YWK ", " ACT",
    " WGA", " ALW", " WLS", " WVB", " WMB", " WAW", " BWI", " IAD", " DCA", " WAS", " ALO",
    " ATY", " CWA", " WEI", " WEL", " WLG", " EAT", " PBI", " WYS", " GWT", " WHK", " YXN",
    " WRE", " HPN", " YXY", " HAP", " WYA", " SPS", " ICT", " WIC", " WHM", " VIE", " WIE",
    " AVP", " IPT", " ISL", " ILM", " VNO", " WUN", " ERS", " WDH", " YQG", " YWG", " OLF",
    " WOL", " UMR", " ORH", " WRL", " WRG", " WUH", " WYN", " XMN ", " XIY", " YKM", " YAK",
    " YKS", " GAJ", " ASK", " YNB", " RGN", " YAO", " YZF", " SVX", " YIH", " YOK", " YUM",
    " ZCL", " ZAD", " ZAG", " ZTH", " ZAZ", " PZH", " ZND", " OUZ", " ZRH" };

    // #region List of all airport codes
    String[] listFlightcodes = { "JP", "EI", "SU", "AR", "AM", "ZB", "AH", "PA", "BP", "2J", "TY", "SB", "AC", "TX",
    "UP", "CA", "EN", "UX", "AF", "IC", "VU", "MD", "KM", "MK", "9U", "SW", "NZ",
    "PX", "TL", "GZ", "HC", "HM", "JU", "YI", "TN", "TC", "8T", "TS", "NF", "ZW", "UM", "FO", "4Z", "AS",
    "AZ", "NH", "AA", "M6", "ZE", "FG", "IZ", "R7", "OZ", "RC", "RC", "IG", "5Y",
    "KK", "OS", "AV", "UP", "PG", "JV", "CH", "BG", "NT", "DB", "BA", "BS", "SN", "FB", "MO", "5T", "9K",
    "BW", "V3", "CX", "KX", "9M", "CI", "MU", "CZ", "DE", "CM", "SS", "OU", "CU",
    "OK", "DL", "KA", "T3", "MS", "LY", "EK", "EM", "ET", "BR", "EV", "EL", "FE", "FJ", "AY", "7F", "BE",
    "F9", "GA", "GB", "GF", "HU", "HA", "YO", "QX", "IB", "FI", "6E", "IR", "LN",
    "JC", "JL", "EG", "NU", "JQ", "KQ", "KL", "WA", "KE", "KU", "KU", "TM", "XL", "LP", "QV", "LI", "LO",
    "LH", "LG", "MH", "AE", "MP", "2M", "ME", "YV", "MX", "ME", "YM", "9K", "RA",
    "EJ", "HW", "ON", "OA", "WY", "8P", "PK", "HI", "KS", "YP", "PR", "LO", "NI", "PW", "PB", "QF", "QR",
    "AT", "BI", "RJ", "FR", "7H", "WB", "S7", "9R", "SV", "SK", "YR", "ZH", "SQ",
    "QS", "IE", "SA", "XO", "WN", "NK", "P8", "UL", "EZ", "SY", "XQ", "PY", "LX", "VR", "PZ", "EQ", "TP",
    "RO", "T2", "TG", "BY", "9N", "TU", "TK", "PS", "UA", "US", "UJ", "VN", "VX",
    "VS", "VA", "VH", "WS", "XP", "IY" };
// #endregion

//#endregion
}