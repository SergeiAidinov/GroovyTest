package first

class MainClass {

	def final static int LIST_SIZE = 10
	def final static int MAX_NUMBER = 5
	def final static Random random = new Random()

	def static createList(){

		List<Integer> originList = []
		for (i in 0..LIST_SIZE) {
			originList.add(random.nextInt(MAX_NUMBER + 1))
		}
		print(originList)
		print(" -> ")

		return(originList)
	}

	def static countFigures(List<Integer> integerList) {

		def map = [:]

		for (number in integerList) {
			if (map.containsKey(number)) {
				def newValue = map.get(number) + 1
				map.put(number, newValue)
			} else {
				map.put(number, 1)
			}
		}

		return map
	}

	static void main(String[] args) {

		print (countFigures(createList()))
	}
}
