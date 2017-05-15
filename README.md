#Task 02.1
Необходимо реализовать коллекцию целых чисел, которая позволяет выполнять операции:
добавления
удаления
поиска элемента по значению
поиска элемента по индексу
поиска максимального элемента
поиска минимального элемента
поиска среднего арифметического всех элементов
При этом:
при добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент
при удалении - уменьшают своё значение на удаляемый элемент
Недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел.
Результатом работы должен быть отдельный репозиторий github/bitbucket с README файлом, который описывает задание, сам класс и содержит инструкции по запуску приложения.

##CollectionDemo demonstrates all required functional
##IntegersCollection description:
`com.homelearning.IntegersCollection implements java.util.Collection<Integer>`

`public IntegersCollection()` - creates the `IntegersCollection` with default size of 16 elements.

`public IntegersCollection(int size)` creates the `IntegersCollection` with predefined size if `size > DEFAULT_SIZE`

`public boolean add(Integer integer)` adds `Integer` to the end, also adds it to every `Integer` of `IntegersCollection`, do nothing if `integer == null`

`public boolean remove(Object o)` removes `Integer` by value and subtracts it from every `Integer` of `IntegersCollection`

`public Integer removeByIndex(int index)`removes `Integer` by index and subtracts it from every `Integer` of `IntegersCollection`

`public int indexOf(Object o)` finds index of `Integer` if contains, else returns `-1`

`public Integer get(int index)` finds `Integer` by index

`public Integer getMaxValue()` finds max `Integer`, returns `null` if `isEmpty()`
 
`public Integer getMinValue()` finds min `Integer`, returns `null` if `isEmpty()` 

`public Integer getAverage()` finds average of elements, returns `null` if `isEmpty()`