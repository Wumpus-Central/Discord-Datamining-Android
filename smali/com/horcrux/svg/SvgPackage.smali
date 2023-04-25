.class public Lcom/horcrux/svg/SvgPackage;
.super Lcom/facebook/react/TurboReactPackage;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/ViewManagerOnDemandReactPackage;


# instance fields
.field private mViewManagers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/TurboReactPackage;-><init>()V

    return-void
.end method

.method private getViewManagersMap(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/horcrux/svg/SvgPackage;->mViewManagers:Ljava/util/Map;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/common/MapBuilder;->newHashMap()Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lcom/horcrux/svg/SvgPackage$k;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$k;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "RNSVGGroup"

    .line 19
    .line 20
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/horcrux/svg/SvgPackage$o;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$o;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "RNSVGPath"

    .line 33
    .line 34
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    new-instance v0, Lcom/horcrux/svg/SvgPackage$p;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$p;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "RNSVGCircle"

    .line 47
    .line 48
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcom/horcrux/svg/SvgPackage$q;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$q;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "RNSVGEllipse"

    .line 61
    .line 62
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    new-instance v0, Lcom/horcrux/svg/SvgPackage$r;

    .line 66
    .line 67
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$r;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string v1, "RNSVGLine"

    .line 75
    .line 76
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    new-instance v0, Lcom/horcrux/svg/SvgPackage$s;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$s;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "RNSVGRect"

    .line 89
    .line 90
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    new-instance v0, Lcom/horcrux/svg/SvgPackage$t;

    .line 94
    .line 95
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$t;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v1, "RNSVGText"

    .line 103
    .line 104
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    new-instance v0, Lcom/horcrux/svg/SvgPackage$u;

    .line 108
    .line 109
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$u;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v1, "RNSVGTSpan"

    .line 117
    .line 118
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    new-instance v0, Lcom/horcrux/svg/SvgPackage$v;

    .line 122
    .line 123
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$v;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v1, "RNSVGTextPath"

    .line 131
    .line 132
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    new-instance v0, Lcom/horcrux/svg/SvgPackage$a;

    .line 136
    .line 137
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$a;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v1, "RNSVGImage"

    .line 145
    .line 146
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    new-instance v0, Lcom/horcrux/svg/SvgPackage$b;

    .line 150
    .line 151
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$b;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-string v1, "RNSVGClipPath"

    .line 159
    .line 160
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    new-instance v0, Lcom/horcrux/svg/SvgPackage$c;

    .line 164
    .line 165
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$c;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const-string v1, "RNSVGDefs"

    .line 173
    .line 174
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    new-instance v0, Lcom/horcrux/svg/SvgPackage$d;

    .line 178
    .line 179
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$d;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const-string v1, "RNSVGUse"

    .line 187
    .line 188
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    new-instance v0, Lcom/horcrux/svg/SvgPackage$e;

    .line 192
    .line 193
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$e;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    const-string v1, "RNSVGSymbol"

    .line 201
    .line 202
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    new-instance v0, Lcom/horcrux/svg/SvgPackage$f;

    .line 206
    .line 207
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$f;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    const-string v1, "RNSVGLinearGradient"

    .line 215
    .line 216
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    new-instance v0, Lcom/horcrux/svg/SvgPackage$g;

    .line 220
    .line 221
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$g;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    const-string v1, "RNSVGRadialGradient"

    .line 229
    .line 230
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    new-instance v0, Lcom/horcrux/svg/SvgPackage$h;

    .line 234
    .line 235
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$h;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-string v1, "RNSVGPattern"

    .line 243
    .line 244
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    new-instance v0, Lcom/horcrux/svg/SvgPackage$i;

    .line 248
    .line 249
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$i;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    const-string v1, "RNSVGMask"

    .line 257
    .line 258
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    new-instance v0, Lcom/horcrux/svg/SvgPackage$j;

    .line 262
    .line 263
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$j;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 264
    .line 265
    .line 266
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    const-string v1, "RNSVGForeignObject"

    .line 271
    .line 272
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    new-instance v0, Lcom/horcrux/svg/SvgPackage$l;

    .line 276
    .line 277
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$l;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    const-string v1, "RNSVGMarker"

    .line 285
    .line 286
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    new-instance v0, Lcom/horcrux/svg/SvgPackage$m;

    .line 290
    .line 291
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$m;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v0}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    const-string v1, "RNSVGSvgViewAndroid"

    .line 299
    .line 300
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    iput-object p1, p0, Lcom/horcrux/svg/SvgPackage;->mViewManagers:Ljava/util/Map;

    .line 304
    .line 305
    :cond_0
    iget-object p1, p0, Lcom/horcrux/svg/SvgPackage;->mViewManagers:Ljava/util/Map;

    .line 306
    .line 307
    return-object p1
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
.end method


# virtual methods
.method public createJSModules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/react/bridge/JavaScriptModule;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public createViewManager(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/SvgPackage;->getViewManagersMap(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/facebook/react/bridge/ModuleSpec;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ModuleSpec;->getProvider()Ljavax/inject/Provider;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/facebook/react/uimanager/ViewManager;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    return-object p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    const-string v0, "RNSVGRenderableModule"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "RNSVGSvgViewModule"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Lcom/horcrux/svg/SvgViewModule;

    .line 23
    .line 24
    invoke-direct {p1, p2}, Lcom/horcrux/svg/SvgViewModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    new-instance p1, Lcom/horcrux/svg/RNSVGRenderableManager;

    .line 29
    .line 30
    invoke-direct {p1, p2}, Lcom/horcrux/svg/RNSVGRenderableManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 31
    .line 32
    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :catch_1
    move-exception v0

    .line 17
    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 18
    .line 19
    const-string v2, "No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider"

    .line 20
    .line 21
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :catch_2
    new-instance v0, Lcom/horcrux/svg/SvgPackage$n;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/horcrux/svg/SvgPackage$n;-><init>(Lcom/horcrux/svg/SvgPackage;)V

    .line 28
    .line 29
    .line 30
    return-object v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method

.method public bridge synthetic getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/horcrux/svg/SvgPackage;->getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/horcrux/svg/SvgPackage;->getViewManagersMap(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method protected getViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/ModuleSpec;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/horcrux/svg/SvgPackage;->getViewManagersMap(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
