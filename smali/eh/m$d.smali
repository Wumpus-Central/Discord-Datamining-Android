.class public final Leh/m$d;
.super Leh/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leh/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final j:Luh/e;


# direct methods
.method public constructor <init>(Luh/e;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Leh/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Leh/m$d;->j:Luh/e;

    return-void
.end method


# virtual methods
.method public final i()Luh/e;
    .locals 1

    iget-object v0, p0, Leh/m$d;->j:Luh/e;

    return-object v0
.end method
