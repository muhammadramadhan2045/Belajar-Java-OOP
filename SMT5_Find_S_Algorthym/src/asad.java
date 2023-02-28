//public static void konvert2arr(Map map, String[] arr) {
//        Set s = map.entrySet();
//        Iterator it = s.iterator();
//        int a = 0;
//        while (it.hasNext()) {
//        Map.Entry entry = (Map.Entry) it.next();
//        Integer key = (Integer) entry.getKey();
//        String value = (String) entry.getValue();
//        arr[a] = value;
//        System.out.println("Arr " + arr[a]);
//        a++;
//        }//while
//        System.out.println("========================");
//        }
//
//public static int hitungJumlah(String[] arrVariabel, String nilaiVar) {
//        int hitung = 0;
//        for (int a = 0; a < arrVariabel.length; a++) {
//        if (arrVariabel[a].equals(nilaiVar)) {
//        hitung++;
//        }
//        }
//        return hitung;
//        }
//
//public static int hitungJumlahWheater(String[] wheater, String[] Class, String nilaiWheater, String nilaiClass) {
//        int hitung = 0;
//        for (int a = 0; a < Class.length; a++) {
//        if (wheater[a].equals(nilaiWheater) && Class[a].equals(nilaiClass)) {
//        hitung++;
//        }
//        }
//        return hitung;
//        }
//
//public static int hitungJumlahCar(String[] car, String[] Class, String nilaiCar, String nilaiClass) {
//        int hitung = 0;
//        for (int a = 0; a < Class.length; a++) {
//        if (car[a].equals(nilaiCar) && Class[a].equals(nilaiClass)) {
//        hitung++;
//        }
//        }
//        return hitung;
//        }
//
//public static double P_class(int jumlah_a, int jumlah_b) {
//        double Pclass = (double) jumlah_a / (jumlah_a + jumlah_b);
//        return Pclass;
//        }
//
//public static double P_atribut(int jumlah_a, int jumlah_b) {
//        double Pclass = (double) jumlah_a / (jumlah_b);
//        return Pclass;
//        }
//
//public static String PrediksiNaiveBayes(String wheater, String car) {
//        double hasilGo_Out = 0;
//        double hasilStay_Home = 0;
//        if (wheater.equals("sunny") && car.equals("working")) {
//        hasilGo_Out = PSunnyGo_out * PWorkingGo_out * PGo_out;
//        hasilStay_Home = PSunnyStay_home * PWorkingStay_home * PStay_home;
//        } else if (wheater.equals("sunny") && car.equals("broken")) {
//        hasilGo_Out = PSunnyGo_out * PBrokenGo_out * PGo_out;
//        hasilStay_Home = PSunnyStay_home * PBrokenStay_home * PStay_home;
//        } else if (wheater.equals("rainy") && car.equals("working")) {
//        hasilGo_Out = PRainyGo_out * PWorkingGo_out * PGo_out;
//        hasilStay_Home = PRainyStay_home * PWorkingStay_home * PStay_home;
//        } else if (wheater.equals("rainy") && car.equals("broken")) {
//        hasilGo_Out = PRainyGo_out * PBrokenGo_out * PGo_out;
//        hasilStay_Home = PRainyStay_home * PBrokenStay_home * PStay_home;
//        }
//        System.out.println("hasil Go-Out = " + hasilGo_Out);
//        System.out.println("hasil Stay-Home = " + hasilStay_Home);
//
//        if (hasilGo_Out > hasilStay_Home) {
//        return "Go-Out";
//        } else {
//        return "Stay-Home";
//        }
//        }
//
//public static void readFromExcel(String file) throws IOException {
//        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
//        HSSFSheet myExcelSheet = myExcelBook.getSheet("training");
//
//        //evaluating cell type
//        FormulaEvaluator formulaEvaluator = myExcelBook.getCreationHelper().createFormulaEvaluator();
//        int a = 0, b = 0, c = 0;
//        for (Row row : myExcelSheet) //iteration over row using for each loop
//        {
//        for (Cell cell : row) //iteration over cell using for each loop
//        {
//
//        switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
//        case NUMERIC:   //field that represents numeric cell type
//        System.out.print(cell.getNumericCellValue() + "\t\t");
//        break;
//        case STRING:    //field that represents string cell type
//
//        if (cell.getColumnIndex() == 0) {
//        System.out.print(cell.getStringCellValue() + "\t\t");
//        Wheater_Temp.put(a, cell.getStringCellValue());
//
//        a++;
//        } else if (cell.getColumnIndex() == 1) {
//        System.out.print(cell.getStringCellValue() + "\t\t");
//        Car_Temp.put(b, cell.getStringCellValue());
//        b++;
//        } else if (cell.getColumnIndex() == 2) {
//        System.out.print(cell.getStringCellValue() + "\t\t");
//        Class_Temp.put(c, cell.getStringCellValue());
//        c++;
//        }
//
//        break;
//        }
//        }
//        System.out.println();
//        myExcelBook.close();
//        }
