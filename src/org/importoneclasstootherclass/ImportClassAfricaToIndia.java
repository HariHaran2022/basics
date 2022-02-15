package org.importoneclasstootherclass;

import org.moveoneclassmethodtootherclass.Africa;

public class ImportClassAfricaToIndia extends Africa {
private void northIndia() {
	System.out.println("north india has many languages");
}
private void southIndia() {
	System.out.println("south india is very nice");
}
public static void main(String[] args) {
	ImportClassAfricaToIndia a = new ImportClassAfricaToIndia();
	a.northIndia();
	a.southIndia();
	a.southAfrica();
	a.northAfrica();
}
}
