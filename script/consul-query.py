import json
import urllib

if __name__ == '__main__':
	servicesurl = 'http://localhost:8500/v1/catalog/services'
	serviceurl='http://localhost:8500/v1/catalog/service'
	metricurl='http:%s:%s/metrics'