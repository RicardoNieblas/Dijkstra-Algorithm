"""
Nombre del programa: Examen Práctico 3er Parcial
Alumno: Ricardo Nieblas Cabrera
Cómo funciona:
	Programa que representa un grafo dirigido con la relación de dominio dentro de un grupo de trabajo de 5 personas.
	- Alejandra -> Beatriz -> Cesar -> Dania
	- Beatriz -> Dania
	- Cesar -> Beatriz -> Ernesto
	- Dania -> Alejandra -> Cesar -> Ernesto
	- Ernesto -> Alejandra -> Beatriz
	Puedes crearlo como lista de adyacencia o matriz de adyacencia.
"""

# se importa la librería de tabulate para poder crear la matriz de adyacencia
from tabulate import tabulate
import matplotlib.pyplot as plt
import networkx as nx

class Vertex:
	# constructor
	def __init__(self, n):
		self.name = n
		self.neighbors = list()

	# agregar vecino
	def addNeighbor(self, n):
		# si n no está en la lista de vecinos
		if n not in self.neighbors:
			# se agrega y se ordena
			self.neighbors.append(n)
			self.neighbors.sort()

class Graph:
	vertices = {}

	# imprimir grafo
	def __str__(self):
		print("\nLista de adyacencia:\n")
		
		# se crea una lista vacía
		allData = []

		# por cada vértice en la lista de vértices
		for key in self.vertices.keys():
			# se agrega a la lista el nombre del vértice y sus vecinos
			allData.append([key, self.vertices[key].neighbors])
		
		# se imprime la lista de adyacencia
		print(tabulate(allData, headers = ["Trabajador", "Dominio"], tablefmt = "github"))

		return ""

	# agregar vértice
	def addVertex(self, v):
		# si el vértice es una instancia de la clase vértice y no está en la lista de vértices
		if isinstance(v, Vertex) and v.name not in self.vertices:
			# agregar el vértice a la lista de vértices
			self.vertices[v.name] = v
			return True
		else: return False

	# agregar arista
	def addEdge(self, u, v):
		# si ambos vértices están en la lista de vértices
		if u in self.vertices and v in self.vertices:
			# por cada vértice en la lista de vértices
			for key, value in self.vertices.items():
				# si el vértice es igual al vértice de origen
				if key == u: value.addNeighbor(v)
				# if key == v: value.addNeighbor(u) -> se comenta porque es dirigido
			return True
		else: return False

# creando grafo, se crea simultáneamente el grafo en networkx
G = Graph(); nxG = nx.DiGraph()

# creando vértices
G.addVertex(Vertex("Alejandra"))
G.addVertex(Vertex("Beatriz"))
G.addVertex(Vertex("Cesar"))
G.addVertex(Vertex("Dania"))
G.addVertex(Vertex("Ernesto"))

# creando aristas para Alejandra
G.addEdge("Alejandra", "Beatriz"); nxG.add_edge("Alejandra", "Beatriz")
G.addEdge("Alejandra", "Cesar"); nxG.add_edge("Alejandra", "Cesar")
G.addEdge("Alejandra", "Dania"); nxG.add_edge("Alejandra", "Dania")

# creando aristas para Beatriz
G.addEdge("Beatriz", "Dania"); nxG.add_edge("Beatriz", "Dania")

# creando aristas para Cesar
G.addEdge("Cesar", "Beatriz"); nxG.add_edge("Cesar", "Beatriz")
G.addEdge("Cesar", "Ernesto"); nxG.add_edge("Cesar", "Ernesto")

# creando aristas para Dania
G.addEdge("Dania", "Alejandra"); nxG.add_edge("Dania", "Alejandra")
G.addEdge("Dania", "Cesar"); nxG.add_edge("Dania", "Cesar")
G.addEdge("Dania", "Ernesto"); nxG.add_edge("Dania", "Ernesto")

# creando aristas para Ernesto
G.addEdge("Ernesto", "Alejandra"); nxG.add_edge("Ernesto", "Alejandra")
G.addEdge("Ernesto", "Beatriz"); nxG.add_edge("Ernesto", "Beatriz")

# imprimiendo grafo (lista de adyacencia)
print(G)
nx.draw(nxG, with_labels = True)
plt.show()

"""
Nombre del programa: Examen Práctico 3er Parcial
Alumno: Ricardo Nieblas Cabrera
Fecha de última modificación: 25/Noviembre/2022
"""