//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.05 at 02:53:59 PM GMT 
//


package com.liveperson.jaxbtest.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for country.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="country">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Afghanistan"/>
 *     &lt;enumeration value="Albania"/>
 *     &lt;enumeration value="Algeria"/>
 *     &lt;enumeration value="Andorra"/>
 *     &lt;enumeration value="Angola"/>
 *     &lt;enumeration value="Anguilla"/>
 *     &lt;enumeration value="Antigua and Barbuda"/>
 *     &lt;enumeration value="Argentine Republic"/>
 *     &lt;enumeration value="Armenia"/>
 *     &lt;enumeration value="Aruba"/>
 *     &lt;enumeration value="Ascension"/>
 *     &lt;enumeration value="Australia"/>
 *     &lt;enumeration value="Austria"/>
 *     &lt;enumeration value="Azerbaijani Republic"/>
 *     &lt;enumeration value="Bahamas"/>
 *     &lt;enumeration value="Bahrain"/>
 *     &lt;enumeration value="Bangladesh"/>
 *     &lt;enumeration value="Barbados"/>
 *     &lt;enumeration value="Belarus"/>
 *     &lt;enumeration value="Belgium"/>
 *     &lt;enumeration value="Belize"/>
 *     &lt;enumeration value="Benin"/>
 *     &lt;enumeration value="Bermuda"/>
 *     &lt;enumeration value="Bhutan"/>
 *     &lt;enumeration value="Bolivia"/>
 *     &lt;enumeration value="Bosnia &amp; Herzegovina"/>
 *     &lt;enumeration value="Botswana"/>
 *     &lt;enumeration value="Brazil"/>
 *     &lt;enumeration value="Brunei"/>
 *     &lt;enumeration value="Bulgaria"/>
 *     &lt;enumeration value="Burkina Faso"/>
 *     &lt;enumeration value="Burundi"/>
 *     &lt;enumeration value="Cambodia"/>
 *     &lt;enumeration value="Cameroon"/>
 *     &lt;enumeration value="Canada"/>
 *     &lt;enumeration value="Cape Verde"/>
 *     &lt;enumeration value="Cayman Islands"/>
 *     &lt;enumeration value="Central African Rep."/>
 *     &lt;enumeration value="Chad"/>
 *     &lt;enumeration value="Chile"/>
 *     &lt;enumeration value="China"/>
 *     &lt;enumeration value="Colombia"/>
 *     &lt;enumeration value="Congo"/>
 *     &lt;enumeration value="Cook Islands"/>
 *     &lt;enumeration value="Costa Rica"/>
 *     &lt;enumeration value="Croatia"/>
 *     &lt;enumeration value="Cuba"/>
 *     &lt;enumeration value="Cyprus"/>
 *     &lt;enumeration value="Czech Republic"/>
 *     &lt;enumeration value="Denmark"/>
 *     &lt;enumeration value="Diego Garcia"/>
 *     &lt;enumeration value="Djibouti"/>
 *     &lt;enumeration value="Dominican Republic"/>
 *     &lt;enumeration value="DPR Korea"/>
 *     &lt;enumeration value="East Timor."/>
 *     &lt;enumeration value="Ecuador"/>
 *     &lt;enumeration value="Egypt"/>
 *     &lt;enumeration value="El Salvador"/>
 *     &lt;enumeration value="Equatorial Guinea"/>
 *     &lt;enumeration value="Eritrea"/>
 *     &lt;enumeration value="Estonia"/>
 *     &lt;enumeration value="Ethiopia"/>
 *     &lt;enumeration value="Falkland Islands"/>
 *     &lt;enumeration value="Faroe Islands"/>
 *     &lt;enumeration value="Fiji"/>
 *     &lt;enumeration value="Finland"/>
 *     &lt;enumeration value="France"/>
 *     &lt;enumeration value="French Guiana"/>
 *     &lt;enumeration value="French Polynesia"/>
 *     &lt;enumeration value="Gabonese Republic"/>
 *     &lt;enumeration value="Gambia"/>
 *     &lt;enumeration value="Georgia"/>
 *     &lt;enumeration value="Germany"/>
 *     &lt;enumeration value="Ghana"/>
 *     &lt;enumeration value="Gibraltar"/>
 *     &lt;enumeration value="Greece"/>
 *     &lt;enumeration value="Greenland"/>
 *     &lt;enumeration value="Grenada"/>
 *     &lt;enumeration value="Guadeloupe"/>
 *     &lt;enumeration value="Guam"/>
 *     &lt;enumeration value="Guatemala"/>
 *     &lt;enumeration value="Guinea"/>
 *     &lt;enumeration value="Guinea-Bissau"/>
 *     &lt;enumeration value="GuriLand"/>
 *     &lt;enumeration value="Guyana"/>
 *     &lt;enumeration value="Haiti"/>
 *     &lt;enumeration value="Honduras"/>
 *     &lt;enumeration value="Hongkong, China"/>
 *     &lt;enumeration value="Hungary"/>
 *     &lt;enumeration value="Iceland"/>
 *     &lt;enumeration value="India"/>
 *     &lt;enumeration value="Indonesia"/>
 *     &lt;enumeration value="Iran"/>
 *     &lt;enumeration value="Iraq"/>
 *     &lt;enumeration value="Ireland"/>
 *     &lt;enumeration value="Israel"/>
 *     &lt;enumeration value="Italy"/>
 *     &lt;enumeration value="Ivory Coast"/>
 *     &lt;enumeration value="Jamaica"/>
 *     &lt;enumeration value="Japan"/>
 *     &lt;enumeration value="Jordan"/>
 *     &lt;enumeration value="Kazakhstan"/>
 *     &lt;enumeration value="Kenya"/>
 *     &lt;enumeration value="Kiribati"/>
 *     &lt;enumeration value="Korea"/>
 *     &lt;enumeration value="Kuwait"/>
 *     &lt;enumeration value="Kyrgyz Republic"/>
 *     &lt;enumeration value="Lao"/>
 *     &lt;enumeration value="Latvia"/>
 *     &lt;enumeration value="Lebanon"/>
 *     &lt;enumeration value="Lesotho"/>
 *     &lt;enumeration value="Liberia"/>
 *     &lt;enumeration value="Libya"/>
 *     &lt;enumeration value="Liechtenstein"/>
 *     &lt;enumeration value="Lithuania"/>
 *     &lt;enumeration value="Luxembourg"/>
 *     &lt;enumeration value="Macao, China"/>
 *     &lt;enumeration value="Macedonia"/>
 *     &lt;enumeration value="Madagascar"/>
 *     &lt;enumeration value="Malawi"/>
 *     &lt;enumeration value="Malaysia"/>
 *     &lt;enumeration value="Maldives"/>
 *     &lt;enumeration value="Mali"/>
 *     &lt;enumeration value="Malta"/>
 *     &lt;enumeration value="Marshall Islands"/>
 *     &lt;enumeration value="Martinique"/>
 *     &lt;enumeration value="Mauritania"/>
 *     &lt;enumeration value="Mauritius"/>
 *     &lt;enumeration value="Mayotte"/>
 *     &lt;enumeration value="Mexico"/>
 *     &lt;enumeration value="Micronesia"/>
 *     &lt;enumeration value="Moldova"/>
 *     &lt;enumeration value="Monaco"/>
 *     &lt;enumeration value="Mongolia"/>
 *     &lt;enumeration value="Montserrat"/>
 *     &lt;enumeration value="Morocco"/>
 *     &lt;enumeration value="Mozambique"/>
 *     &lt;enumeration value="Myanmar"/>
 *     &lt;enumeration value="Namibia"/>
 *     &lt;enumeration value="Nauru"/>
 *     &lt;enumeration value="Nepal"/>
 *     &lt;enumeration value="Netherlands"/>
 *     &lt;enumeration value="Netherlands Antilles"/>
 *     &lt;enumeration value="New Caledonia"/>
 *     &lt;enumeration value="New Zealand"/>
 *     &lt;enumeration value="Nicaragua"/>
 *     &lt;enumeration value="Niger"/>
 *     &lt;enumeration value="Nigeria"/>
 *     &lt;enumeration value="Niue"/>
 *     &lt;enumeration value="Norfolk Island"/>
 *     &lt;enumeration value="Northern Mariana Islands"/>
 *     &lt;enumeration value="Norway"/>
 *     &lt;enumeration value="Oman"/>
 *     &lt;enumeration value="Pakistan"/>
 *     &lt;enumeration value="Palau"/>
 *     &lt;enumeration value="Panama"/>
 *     &lt;enumeration value="Papua New Guinea"/>
 *     &lt;enumeration value="Paraguay"/>
 *     &lt;enumeration value="Peru"/>
 *     &lt;enumeration value="Philippines"/>
 *     &lt;enumeration value="Poland"/>
 *     &lt;enumeration value="Portugal"/>
 *     &lt;enumeration value="Puerto Rico"/>
 *     &lt;enumeration value="Qatar"/>
 *     &lt;enumeration value="Reunion Island."/>
 *     &lt;enumeration value="Romania"/>
 *     &lt;enumeration value="Russian Federation"/>
 *     &lt;enumeration value="Rwandese Republic"/>
 *     &lt;enumeration value="Saint Helena"/>
 *     &lt;enumeration value="Saint Kitts and Nevis"/>
 *     &lt;enumeration value="Saint Lucia"/>
 *     &lt;enumeration value="Samoa"/>
 *     &lt;enumeration value="San Marino"/>
 *     &lt;enumeration value="Sao Tome &amp; Principe"/>
 *     &lt;enumeration value="Saudi Arabia"/>
 *     &lt;enumeration value="Senegal"/>
 *     &lt;enumeration value="Serbia &amp; Montenegro"/>
 *     &lt;enumeration value="Seychelles"/>
 *     &lt;enumeration value="Sierra Leone"/>
 *     &lt;enumeration value="Singapore"/>
 *     &lt;enumeration value="Slovak Republic"/>
 *     &lt;enumeration value="Slovenia"/>
 *     &lt;enumeration value="Solomon Islands"/>
 *     &lt;enumeration value="Somalia"/>
 *     &lt;enumeration value="South Africa"/>
 *     &lt;enumeration value="Spain"/>
 *     &lt;enumeration value="Sri Lanka"/>
 *     &lt;enumeration value="St. Pierre/Miquolon"/>
 *     &lt;enumeration value="Sudan"/>
 *     &lt;enumeration value="Suriname"/>
 *     &lt;enumeration value="Swaziland"/>
 *     &lt;enumeration value="Sweden"/>
 *     &lt;enumeration value="Switzerland"/>
 *     &lt;enumeration value="Syrian Arab Republic"/>
 *     &lt;enumeration value="Taiwan"/>
 *     &lt;enumeration value="Tajikistan"/>
 *     &lt;enumeration value="Tanzania"/>
 *     &lt;enumeration value="Thailand"/>
 *     &lt;enumeration value="Togolese Republic"/>
 *     &lt;enumeration value="Tokelau"/>
 *     &lt;enumeration value="Tonga"/>
 *     &lt;enumeration value="Trinidad and Tobago"/>
 *     &lt;enumeration value="Tunisia"/>
 *     &lt;enumeration value="Turkey"/>
 *     &lt;enumeration value="Turkmenistan"/>
 *     &lt;enumeration value="Turks and Caicos Islands"/>
 *     &lt;enumeration value="Tuvalu"/>
 *     &lt;enumeration value="Uganda"/>
 *     &lt;enumeration value="Ukraine"/>
 *     &lt;enumeration value="United Arab Emirates"/>
 *     &lt;enumeration value="United Kingdom"/>
 *     &lt;enumeration value="United States"/>
 *     &lt;enumeration value="United States of America"/>
 *     &lt;enumeration value="Uruguay"/>
 *     &lt;enumeration value="Uzbekistan"/>
 *     &lt;enumeration value="Vanuatu"/>
 *     &lt;enumeration value="Vatican City State"/>
 *     &lt;enumeration value="Vatican City State"/>
 *     &lt;enumeration value="Venezuela"/>
 *     &lt;enumeration value="Vietnam"/>
 *     &lt;enumeration value="Wallis &amp; Futuna"/>
 *     &lt;enumeration value="Yemen"/>
 *     &lt;enumeration value="Zambia"/>
 *     &lt;enumeration value="Zimbabwe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "country")
@XmlEnum
public enum Country {

    @XmlEnumValue("Afghanistan")
    AFGHANISTAN("Afghanistan"),
    @XmlEnumValue("Albania")
    ALBANIA("Albania"),
    @XmlEnumValue("Algeria")
    ALGERIA("Algeria"),
    @XmlEnumValue("Andorra")
    ANDORRA("Andorra"),
    @XmlEnumValue("Angola")
    ANGOLA("Angola"),
    @XmlEnumValue("Anguilla")
    ANGUILLA("Anguilla"),
    @XmlEnumValue("Antigua and Barbuda")
    ANTIGUA_AND_BARBUDA("Antigua and Barbuda"),
    @XmlEnumValue("Argentine Republic")
    ARGENTINE_REPUBLIC("Argentine Republic"),
    @XmlEnumValue("Armenia")
    ARMENIA("Armenia"),
    @XmlEnumValue("Aruba")
    ARUBA("Aruba"),
    @XmlEnumValue("Ascension")
    ASCENSION("Ascension"),
    @XmlEnumValue("Australia")
    AUSTRALIA("Australia"),
    @XmlEnumValue("Austria")
    AUSTRIA("Austria"),
    @XmlEnumValue("Azerbaijani Republic")
    AZERBAIJANI_REPUBLIC("Azerbaijani Republic"),
    @XmlEnumValue("Bahamas")
    BAHAMAS("Bahamas"),
    @XmlEnumValue("Bahrain")
    BAHRAIN("Bahrain"),
    @XmlEnumValue("Bangladesh")
    BANGLADESH("Bangladesh"),
    @XmlEnumValue("Barbados")
    BARBADOS("Barbados"),
    @XmlEnumValue("Belarus")
    BELARUS("Belarus"),
    @XmlEnumValue("Belgium")
    BELGIUM("Belgium"),
    @XmlEnumValue("Belize")
    BELIZE("Belize"),
    @XmlEnumValue("Benin")
    BENIN("Benin"),
    @XmlEnumValue("Bermuda")
    BERMUDA("Bermuda"),
    @XmlEnumValue("Bhutan")
    BHUTAN("Bhutan"),
    @XmlEnumValue("Bolivia")
    BOLIVIA("Bolivia"),
    @XmlEnumValue("Bosnia & Herzegovina")
    BOSNIA_HERZEGOVINA("Bosnia & Herzegovina"),
    @XmlEnumValue("Botswana")
    BOTSWANA("Botswana"),
    @XmlEnumValue("Brazil")
    BRAZIL("Brazil"),
    @XmlEnumValue("Brunei")
    BRUNEI("Brunei"),
    @XmlEnumValue("Bulgaria")
    BULGARIA("Bulgaria"),
    @XmlEnumValue("Burkina Faso")
    BURKINA_FASO("Burkina Faso"),
    @XmlEnumValue("Burundi")
    BURUNDI("Burundi"),
    @XmlEnumValue("Cambodia")
    CAMBODIA("Cambodia"),
    @XmlEnumValue("Cameroon")
    CAMEROON("Cameroon"),
    @XmlEnumValue("Canada")
    CANADA("Canada"),
    @XmlEnumValue("Cape Verde")
    CAPE_VERDE("Cape Verde"),
    @XmlEnumValue("Cayman Islands")
    CAYMAN_ISLANDS("Cayman Islands"),
    @XmlEnumValue("Central African Rep.")
    CENTRAL_AFRICAN_REP("Central African Rep."),
    @XmlEnumValue("Chad")
    CHAD("Chad"),
    @XmlEnumValue("Chile")
    CHILE("Chile"),
    @XmlEnumValue("China")
    CHINA("China"),
    @XmlEnumValue("Colombia")
    COLOMBIA("Colombia"),
    @XmlEnumValue("Congo")
    CONGO("Congo"),
    @XmlEnumValue("Cook Islands")
    COOK_ISLANDS("Cook Islands"),
    @XmlEnumValue("Costa Rica")
    COSTA_RICA("Costa Rica"),
    @XmlEnumValue("Croatia")
    CROATIA("Croatia"),
    @XmlEnumValue("Cuba")
    CUBA("Cuba"),
    @XmlEnumValue("Cyprus")
    CYPRUS("Cyprus"),
    @XmlEnumValue("Czech Republic")
    CZECH_REPUBLIC("Czech Republic"),
    @XmlEnumValue("Denmark")
    DENMARK("Denmark"),
    @XmlEnumValue("Diego Garcia")
    DIEGO_GARCIA("Diego Garcia"),
    @XmlEnumValue("Djibouti")
    DJIBOUTI("Djibouti"),
    @XmlEnumValue("Dominican Republic")
    DOMINICAN_REPUBLIC("Dominican Republic"),
    @XmlEnumValue("DPR Korea")
    DPR_KOREA("DPR Korea"),
    @XmlEnumValue("East Timor.")
    EAST_TIMOR("East Timor."),
    @XmlEnumValue("Ecuador")
    ECUADOR("Ecuador"),
    @XmlEnumValue("Egypt")
    EGYPT("Egypt"),
    @XmlEnumValue("El Salvador")
    EL_SALVADOR("El Salvador"),
    @XmlEnumValue("Equatorial Guinea")
    EQUATORIAL_GUINEA("Equatorial Guinea"),
    @XmlEnumValue("Eritrea")
    ERITREA("Eritrea"),
    @XmlEnumValue("Estonia")
    ESTONIA("Estonia"),
    @XmlEnumValue("Ethiopia")
    ETHIOPIA("Ethiopia"),
    @XmlEnumValue("Falkland Islands")
    FALKLAND_ISLANDS("Falkland Islands"),
    @XmlEnumValue("Faroe Islands")
    FAROE_ISLANDS("Faroe Islands"),
    @XmlEnumValue("Fiji")
    FIJI("Fiji"),
    @XmlEnumValue("Finland")
    FINLAND("Finland"),
    @XmlEnumValue("France")
    FRANCE("France"),
    @XmlEnumValue("French Guiana")
    FRENCH_GUIANA("French Guiana"),
    @XmlEnumValue("French Polynesia")
    FRENCH_POLYNESIA("French Polynesia"),
    @XmlEnumValue("Gabonese Republic")
    GABONESE_REPUBLIC("Gabonese Republic"),
    @XmlEnumValue("Gambia")
    GAMBIA("Gambia"),
    @XmlEnumValue("Georgia")
    GEORGIA("Georgia"),
    @XmlEnumValue("Germany")
    GERMANY("Germany"),
    @XmlEnumValue("Ghana")
    GHANA("Ghana"),
    @XmlEnumValue("Gibraltar")
    GIBRALTAR("Gibraltar"),
    @XmlEnumValue("Greece")
    GREECE("Greece"),
    @XmlEnumValue("Greenland")
    GREENLAND("Greenland"),
    @XmlEnumValue("Grenada")
    GRENADA("Grenada"),
    @XmlEnumValue("Guadeloupe")
    GUADELOUPE("Guadeloupe"),
    @XmlEnumValue("Guam")
    GUAM("Guam"),
    @XmlEnumValue("Guatemala")
    GUATEMALA("Guatemala"),
    @XmlEnumValue("Guinea")
    GUINEA("Guinea"),
    @XmlEnumValue("Guinea-Bissau")
    GUINEA_BISSAU("Guinea-Bissau"),
    @XmlEnumValue("GuriLand")
    GURI_LAND("GuriLand"),
    @XmlEnumValue("Guyana")
    GUYANA("Guyana"),
    @XmlEnumValue("Haiti")
    HAITI("Haiti"),
    @XmlEnumValue("Honduras")
    HONDURAS("Honduras"),
    @XmlEnumValue("Hongkong, China")
    HONGKONG_CHINA("Hongkong, China"),
    @XmlEnumValue("Hungary")
    HUNGARY("Hungary"),
    @XmlEnumValue("Iceland")
    ICELAND("Iceland"),
    @XmlEnumValue("India")
    INDIA("India"),
    @XmlEnumValue("Indonesia")
    INDONESIA("Indonesia"),
    @XmlEnumValue("Iran")
    IRAN("Iran"),
    @XmlEnumValue("Iraq")
    IRAQ("Iraq"),
    @XmlEnumValue("Ireland")
    IRELAND("Ireland"),
    @XmlEnumValue("Israel")
    ISRAEL("Israel"),
    @XmlEnumValue("Italy")
    ITALY("Italy"),
    @XmlEnumValue("Ivory Coast")
    IVORY_COAST("Ivory Coast"),
    @XmlEnumValue("Jamaica")
    JAMAICA("Jamaica"),
    @XmlEnumValue("Japan")
    JAPAN("Japan"),
    @XmlEnumValue("Jordan")
    JORDAN("Jordan"),
    @XmlEnumValue("Kazakhstan")
    KAZAKHSTAN("Kazakhstan"),
    @XmlEnumValue("Kenya")
    KENYA("Kenya"),
    @XmlEnumValue("Kiribati")
    KIRIBATI("Kiribati"),
    @XmlEnumValue("Korea")
    KOREA("Korea"),
    @XmlEnumValue("Kuwait")
    KUWAIT("Kuwait"),
    @XmlEnumValue("Kyrgyz Republic")
    KYRGYZ_REPUBLIC("Kyrgyz Republic"),
    @XmlEnumValue("Lao")
    LAO("Lao"),
    @XmlEnumValue("Latvia")
    LATVIA("Latvia"),
    @XmlEnumValue("Lebanon")
    LEBANON("Lebanon"),
    @XmlEnumValue("Lesotho")
    LESOTHO("Lesotho"),
    @XmlEnumValue("Liberia")
    LIBERIA("Liberia"),
    @XmlEnumValue("Libya")
    LIBYA("Libya"),
    @XmlEnumValue("Liechtenstein")
    LIECHTENSTEIN("Liechtenstein"),
    @XmlEnumValue("Lithuania")
    LITHUANIA("Lithuania"),
    @XmlEnumValue("Luxembourg")
    LUXEMBOURG("Luxembourg"),
    @XmlEnumValue("Macao, China")
    MACAO_CHINA("Macao, China"),
    @XmlEnumValue("Macedonia")
    MACEDONIA("Macedonia"),
    @XmlEnumValue("Madagascar")
    MADAGASCAR("Madagascar"),
    @XmlEnumValue("Malawi")
    MALAWI("Malawi"),
    @XmlEnumValue("Malaysia")
    MALAYSIA("Malaysia"),
    @XmlEnumValue("Maldives")
    MALDIVES("Maldives"),
    @XmlEnumValue("Mali")
    MALI("Mali"),
    @XmlEnumValue("Malta")
    MALTA("Malta"),
    @XmlEnumValue("Marshall Islands")
    MARSHALL_ISLANDS("Marshall Islands"),
    @XmlEnumValue("Martinique")
    MARTINIQUE("Martinique"),
    @XmlEnumValue("Mauritania")
    MAURITANIA("Mauritania"),
    @XmlEnumValue("Mauritius")
    MAURITIUS("Mauritius"),
    @XmlEnumValue("Mayotte")
    MAYOTTE("Mayotte"),
    @XmlEnumValue("Mexico")
    MEXICO("Mexico"),
    @XmlEnumValue("Micronesia")
    MICRONESIA("Micronesia"),
    @XmlEnumValue("Moldova")
    MOLDOVA("Moldova"),
    @XmlEnumValue("Monaco")
    MONACO("Monaco"),
    @XmlEnumValue("Mongolia")
    MONGOLIA("Mongolia"),
    @XmlEnumValue("Montserrat")
    MONTSERRAT("Montserrat"),
    @XmlEnumValue("Morocco")
    MOROCCO("Morocco"),
    @XmlEnumValue("Mozambique")
    MOZAMBIQUE("Mozambique"),
    @XmlEnumValue("Myanmar")
    MYANMAR("Myanmar"),
    @XmlEnumValue("Namibia")
    NAMIBIA("Namibia"),
    @XmlEnumValue("Nauru")
    NAURU("Nauru"),
    @XmlEnumValue("Nepal")
    NEPAL("Nepal"),
    @XmlEnumValue("Netherlands")
    NETHERLANDS("Netherlands"),
    @XmlEnumValue("Netherlands Antilles")
    NETHERLANDS_ANTILLES("Netherlands Antilles"),
    @XmlEnumValue("New Caledonia")
    NEW_CALEDONIA("New Caledonia"),
    @XmlEnumValue("New Zealand")
    NEW_ZEALAND("New Zealand"),
    @XmlEnumValue("Nicaragua")
    NICARAGUA("Nicaragua"),
    @XmlEnumValue("Niger")
    NIGER("Niger"),
    @XmlEnumValue("Nigeria")
    NIGERIA("Nigeria"),
    @XmlEnumValue("Niue")
    NIUE("Niue"),
    @XmlEnumValue("Norfolk Island")
    NORFOLK_ISLAND("Norfolk Island"),
    @XmlEnumValue("Northern Mariana Islands")
    NORTHERN_MARIANA_ISLANDS("Northern Mariana Islands"),
    @XmlEnumValue("Norway")
    NORWAY("Norway"),
    @XmlEnumValue("Oman")
    OMAN("Oman"),
    @XmlEnumValue("Pakistan")
    PAKISTAN("Pakistan"),
    @XmlEnumValue("Palau")
    PALAU("Palau"),
    @XmlEnumValue("Panama")
    PANAMA("Panama"),
    @XmlEnumValue("Papua New Guinea")
    PAPUA_NEW_GUINEA("Papua New Guinea"),
    @XmlEnumValue("Paraguay")
    PARAGUAY("Paraguay"),
    @XmlEnumValue("Peru")
    PERU("Peru"),
    @XmlEnumValue("Philippines")
    PHILIPPINES("Philippines"),
    @XmlEnumValue("Poland")
    POLAND("Poland"),
    @XmlEnumValue("Portugal")
    PORTUGAL("Portugal"),
    @XmlEnumValue("Puerto Rico")
    PUERTO_RICO("Puerto Rico"),
    @XmlEnumValue("Qatar")
    QATAR("Qatar"),
    @XmlEnumValue("Reunion Island.")
    REUNION_ISLAND("Reunion Island."),
    @XmlEnumValue("Romania")
    ROMANIA("Romania"),
    @XmlEnumValue("Russian Federation")
    RUSSIAN_FEDERATION("Russian Federation"),
    @XmlEnumValue("Rwandese Republic")
    RWANDESE_REPUBLIC("Rwandese Republic"),
    @XmlEnumValue("Saint Helena")
    SAINT_HELENA("Saint Helena"),
    @XmlEnumValue("Saint Kitts and Nevis")
    SAINT_KITTS_AND_NEVIS("Saint Kitts and Nevis"),
    @XmlEnumValue("Saint Lucia")
    SAINT_LUCIA("Saint Lucia"),
    @XmlEnumValue("Samoa")
    SAMOA("Samoa"),
    @XmlEnumValue("San Marino")
    SAN_MARINO("San Marino"),
    @XmlEnumValue("Sao Tome & Principe")
    SAO_TOME_PRINCIPE("Sao Tome & Principe"),
    @XmlEnumValue("Saudi Arabia")
    SAUDI_ARABIA("Saudi Arabia"),
    @XmlEnumValue("Senegal")
    SENEGAL("Senegal"),
    @XmlEnumValue("Serbia & Montenegro")
    SERBIA_MONTENEGRO("Serbia & Montenegro"),
    @XmlEnumValue("Seychelles")
    SEYCHELLES("Seychelles"),
    @XmlEnumValue("Sierra Leone")
    SIERRA_LEONE("Sierra Leone"),
    @XmlEnumValue("Singapore")
    SINGAPORE("Singapore"),
    @XmlEnumValue("Slovak Republic")
    SLOVAK_REPUBLIC("Slovak Republic"),
    @XmlEnumValue("Slovenia")
    SLOVENIA("Slovenia"),
    @XmlEnumValue("Solomon Islands")
    SOLOMON_ISLANDS("Solomon Islands"),
    @XmlEnumValue("Somalia")
    SOMALIA("Somalia"),
    @XmlEnumValue("South Africa")
    SOUTH_AFRICA("South Africa"),
    @XmlEnumValue("Spain")
    SPAIN("Spain"),
    @XmlEnumValue("Sri Lanka")
    SRI_LANKA("Sri Lanka"),
    @XmlEnumValue("St. Pierre/Miquolon")
    ST_PIERRE_MIQUOLON("St. Pierre/Miquolon"),
    @XmlEnumValue("Sudan")
    SUDAN("Sudan"),
    @XmlEnumValue("Suriname")
    SURINAME("Suriname"),
    @XmlEnumValue("Swaziland")
    SWAZILAND("Swaziland"),
    @XmlEnumValue("Sweden")
    SWEDEN("Sweden"),
    @XmlEnumValue("Switzerland")
    SWITZERLAND("Switzerland"),
    @XmlEnumValue("Syrian Arab Republic")
    SYRIAN_ARAB_REPUBLIC("Syrian Arab Republic"),
    @XmlEnumValue("Taiwan")
    TAIWAN("Taiwan"),
    @XmlEnumValue("Tajikistan")
    TAJIKISTAN("Tajikistan"),
    @XmlEnumValue("Tanzania")
    TANZANIA("Tanzania"),
    @XmlEnumValue("Thailand")
    THAILAND("Thailand"),
    @XmlEnumValue("Togolese Republic")
    TOGOLESE_REPUBLIC("Togolese Republic"),
    @XmlEnumValue("Tokelau")
    TOKELAU("Tokelau"),
    @XmlEnumValue("Tonga")
    TONGA("Tonga"),
    @XmlEnumValue("Trinidad and Tobago")
    TRINIDAD_AND_TOBAGO("Trinidad and Tobago"),
    @XmlEnumValue("Tunisia")
    TUNISIA("Tunisia"),
    @XmlEnumValue("Turkey")
    TURKEY("Turkey"),
    @XmlEnumValue("Turkmenistan")
    TURKMENISTAN("Turkmenistan"),
    @XmlEnumValue("Turks and Caicos Islands")
    TURKS_AND_CAICOS_ISLANDS("Turks and Caicos Islands"),
    @XmlEnumValue("Tuvalu")
    TUVALU("Tuvalu"),
    @XmlEnumValue("Uganda")
    UGANDA("Uganda"),
    @XmlEnumValue("Ukraine")
    UKRAINE("Ukraine"),
    @XmlEnumValue("United Arab Emirates")
    UNITED_ARAB_EMIRATES("United Arab Emirates"),
    @XmlEnumValue("United Kingdom")
    UNITED_KINGDOM("United Kingdom"),
    @XmlEnumValue("United States")
    UNITED_STATES("United States"),
    @XmlEnumValue("United States of America")
    UNITED_STATES_OF_AMERICA("United States of America"),
    @XmlEnumValue("Uruguay")
    URUGUAY("Uruguay"),
    @XmlEnumValue("Uzbekistan")
    UZBEKISTAN("Uzbekistan"),
    @XmlEnumValue("Vanuatu")
    VANUATU("Vanuatu"),
    @XmlEnumValue("Vatican City State")
    VATICAN_CITY_STATE("Vatican City State"),
    @XmlEnumValue("Venezuela")
    VENEZUELA("Venezuela"),
    @XmlEnumValue("Vietnam")
    VIETNAM("Vietnam"),
    @XmlEnumValue("Wallis & Futuna")
    WALLIS_FUTUNA("Wallis & Futuna"),
    @XmlEnumValue("Yemen")
    YEMEN("Yemen"),
    @XmlEnumValue("Zambia")
    ZAMBIA("Zambia"),
    @XmlEnumValue("Zimbabwe")
    ZIMBABWE("Zimbabwe");
    private final String value;

    Country(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Country fromValue(String v) {
        for (Country c: Country.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
