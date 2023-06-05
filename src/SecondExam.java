public class SecondExam {

    /** Yeni bir host oluşturur, var olan dosyalardan ilkini yazar ve sonrakileri yeni oluşturulan
     *  dosyada var mı kontrol eder yoksa olmayanları  yazarım.
     *
     * function updateHostsFile(existingHostsFile, newHostsFile)
     *     existingRecords = readHostsFile(existingHostsFile)
     *     newRecords = readHostsFile(newHostsFile)
     *     uniqueRecords = set(existingRecords)
     *     for record in newRecords
     *         if record not in uniqueRecords
     *             add record to uniqueRecords
     *     writeHostsFile(existingHostsFile, uniqueRecords)
     *
     * Dosyayı oku içindeki kayıtları listeye dönüştür. Boş satırları atla ve her
     * satırı okurken başındaki ve sonundaki boşlukları kaldır.
     * function readHostsFile(filePath)
     *     records = empty list
     *     open file at filePath
     *     for each line in the file
     *         trimmedLine = remove leading and trailing whitespace from line
     *         if trimmedLine is not empty
     *             add trimmedLine to records
     *     close the file
     *     return records
     *
     * Her kaydı dosyaya bir satır olarak yaz.
     * function writeHostsFile(filePath, records)
     *     open file at filePath for writing
     *     for each record in records
     *         write record to the file followed by a new line
     *     close the file
     * existingHostsFile = "/etc/hosts"
     * newHostsFile = "MyHost.txt"
     * updateHostsFile(existingHostsFile, newHostsFile)
     */
}
