package day26_ForEachLoop_constructor;

public class C06 {
    C06(){
        // bu constructor default constructor'in özelliklerine sahiptir
        // ama constructor görünür olduğundan, buna default constructor diyemeyiz
        // bu constructor' ekeldiğimiz için default constructor silinir
    }
    void C06(){
        // bu bir constructor değildir
        // ama return type' olduğundan method'dur
    }
    //c06(){
        // Invalid method declaration; return type required
        // class adı ile aynı olmadığından constructor olamaz
        // return type'ı olmadığı için method da olamaz
        // bunun için java altını kırmızı çizer CTE yazar
    }

    /*
    Constructor bazı kaynaklarda özel bir method diye geçer.
    Ama çoğunluğun kabulüyle
    contructor başka yapılardan farklı kendisine özgü bir yapıdır.

    Constructor,  contructor'dır.

    Bir kod bloğunun constructor olabilmesi için
    2 şartı gerçekleştirmesi gerekir
    1-İsmi class ismi ile aynı olmalıdır.
    2-return type'ı olmaz
     */



