function isValid(s, r = /\(\)|\[\]|\{\}/g) {
    while (s.match(r)) s = s.replace(r, '')
    return !s
}