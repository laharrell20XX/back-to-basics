timesHitValleys = function (steps) {
    seaLevel = 0
    curLevel = 0
    reachedValley = 0
    steps.forEach(function (step) {
	if (curLevel < seaLevel) {
	    curLevel += step
	}
	else {
	    curLevel += step
	    if (curLevel < seaLevel) {
		reachedValley += 1
	    }
	}
    })

    return reachedValley
}

test1Arr = [1,0,-1,-2,1,0,1,0]
test2Arr = [-1,-1,-1,-1,-1,-4]
test3Arr = [1,-2,2,-2,2,-2,0,1,0]
console.log(`Test 1: ${timesHitValleys(test1Arr) == 1}`)
console.log(`Test 2: ${timesHitValleys(test2Arr) == 1}`)
console.log(`Test 3: ${timesHitValleys(test3Arr) == 3}`)

