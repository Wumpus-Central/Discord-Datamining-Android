.class public Lcom/facebook/react/util/ExceptionDataHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final EXTRA_DATA_FIELD:Ljava/lang/String; = "extraData"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getExtraDataAsJson(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    const-string v1, "extraData"

    .line 5
    .line 6
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Null:Lcom/facebook/react/bridge/ReadableType;

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    :try_start_0
    new-instance v2, Ljava/io/StringWriter;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v3, Landroid/util/JsonWriter;

    .line 21
    .line 22
    invoke-direct {v3, v2}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {v3, p0}, Lcom/facebook/react/bridge/JsonWriterHelper;->value(Landroid/util/JsonWriter;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/util/JsonWriter;->close()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/io/Writer;->close()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    return-object p0

    .line 43
    :catch_0
    :cond_1
    :goto_0
    return-object v0
    .line 44
    .line 45
    .line 46
.end method
