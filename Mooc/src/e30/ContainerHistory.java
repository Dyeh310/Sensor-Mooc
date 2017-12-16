package e30;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

	private List<Double> history;

	public ContainerHistory() {
		this.history = new ArrayList<Double>();
	}

	public void add(double situation) {
		history.add(situation);
	}

	public void reset() {
		history.removeAll(history);
	}

	public double maxValue() {
		double max = 0;
		if (history.isEmpty()) {
			return 0;
		} else {
			for (Double d : history) {
				if (d > max) {
					max = d;
				}
			}
		}
		return max;
	}

	public double minValue() {
		double min = 0;
		if (history.isEmpty()) {
			return 0;
		} else {
			min = maxValue();
			for (Double d : history) {
				if (d < min) {
					min = d;
				}
			}
		}
		return min;
	}

	public double average() {
		double average = 0;
		double total = 0;
		int count = 0;
		if (history.isEmpty()) {
			return 0;
		} else {
			for (Double d : history) {
				total += d;
				count++;
			}
		}
		average = total / count;
		return average;
	}
	
	public double greatestFlucuation() {
		List<Double> fluctuations = new ArrayList<Double>();
		double greatestFluctuation = 0;
		if (history.isEmpty() || history.size() == 1) {
			return greatestFluctuation;
		} else {
			for (int i = history.size() - 1; i >= 1; i--) {
				double fluctuation = Math.abs(history.get(i) - history.get(i - 1));
				fluctuations.add(fluctuation);
			}
		}
		for (double f : fluctuations) {
			if (greatestFluctuation < f) {
				greatestFluctuation = f;
			}
		}
		return greatestFluctuation;
	}
	
	public double variance() {
		double varianceSum = 0;
		if(history.isEmpty() || history.size() == 1) {
			return varianceSum;
		} else {
			for (double h : history) {
				varianceSum += (h - this.average()) *(h - this.average());
			}
		}
		double variance = varianceSum/(history.size() - 1);
		return variance;
	}

	public String toString() {
		return this.history.toString();
	}
}
