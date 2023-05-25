import networkx, pandas, numpy

nodes = list(range(100))

df1 = pandas.DataFrame({'from':   numpy.random.choice(nodes, 100),
                        'to':     numpy.random.choice(nodes, 100),
                        'weight': numpy.random.choice(nodes, 100)
                        })

df = pandas.read_csv('GraphTest.csv')
df = df.rename({'2': 'from', '1': 'to', '9': 'weight'}, axis = 1)

Graph = networkx.from_pandas_edgelist(df, source = 'from', target = 'to', edge_attr = 'weight')

pos = networkx.spring_layout(Graph, k = 10)
networkx.draw_networkx(Graph, pos, with_labels = True)
labels = {e: Graph.edges[e]['weight'] for e in Graph.edges}
networkx.draw_networkx_edge_labels(Graph, pos, edge_labels = labels)